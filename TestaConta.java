public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta("Danilo", 123, "001", 100.0, "01/01/2023");
        Conta c2 = new Conta("Danilo", 123, "001", 100.0, "01/01/2023");

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

        // Agora, se queremos criar uma instância de Data e atribuir a c1.dataDeAbertura:
        Conta outraConta = new Conta(); // Criando uma nova conta
        Data data = new Data(); // Criando uma instância de Data
        data.dia = 23;
        data.mes = 11;
        data.ano = 2023;

        outraConta.dataDeAbertura = data; // Atribuindo a instância de Data à outraConta
    }
}