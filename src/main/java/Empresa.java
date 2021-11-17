public class Empresa {
    public static String formula = "7.75 * horaExtra + salario";

    public static double calcularSalario(double salario, double horaExtra) {
        String expressao;
        expressao = formula.replace("salario", Double.toString(salario));
        expressao = expressao.replace("horaExtra", Double.toString(horaExtra));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
