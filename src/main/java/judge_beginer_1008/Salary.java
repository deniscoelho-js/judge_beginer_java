package judge_beginer_1008;

import java.text.DecimalFormat;

public class Salary {
    private int numeroFuncionario;
    private int horasTrabalhadas;
    private float valorRecebidoPorHora;

    public Salary(int numeroFuncionario, int horasTrabalhadas, float valorRecebidoPorHora) {
        this.numeroFuncionario = numeroFuncionario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorRecebidoPorHora = valorRecebidoPorHora;
    }

    public String salario(){
        float resultado;
        DecimalFormat df = new DecimalFormat("#.##");

        resultado = (getHorasTrabalhadas() * getValorRecebidoPorHora());
        return df.format(resultado);
    }

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public float getValorRecebidoPorHora() {
        return valorRecebidoPorHora;
    }

    public void setValorRecebidoPorHora(float valorRecebidoPorHora) {
        this.valorRecebidoPorHora = valorRecebidoPorHora;
    }
}
