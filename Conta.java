import java.time.LocalDate;

class Data {
    int dia;
    int mes;
    int ano;

    public String formatada() {
        return dia + "/" + mes + "/" + ano;
    }
}


public class Conta {
    Data dataDeAbertura;
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String nomeTitular, int numero, String agencia, double saldo, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void saca(double valor) {
        // Implementação do método saca...
    }

    public void deposita(double valor) {
        // Implementação do método deposita...
    }

    public double calculaRendimento() {
        // Implementação do método calculaRendimento...
    }

    public String recuperaDadosParaImpressao() {
        String dados = "\nTitular: " + this.nomeTitular +
                "\nNúmero: " + this.numero +
                "\nAgência: " + this.agencia +
                "\nSaldo: R$" + this.saldo +
                "\nData de abertura: ";

        if (this.dataDeAbertura != null) {
            dados += this.dataDeAbertura.formatada();
        } else {
            dados += "Não especificada";
        }

        return dados;
    }
}

