public class Estagiario {
    private double salario;
    private double horasExtras;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double calcularSalario() {
        return Empresa.calcularSalario(this.salario, this.horasExtras);
    }
}
