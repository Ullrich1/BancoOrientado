import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        try {
            Banco c1 = new Banco(1, 100, "Sede", 1);
            while (op != 5) {
                System.out.println("\n ~~Bem vindo ao banco do mal\n\nQual opreação deseja realizar hoje?\n\n"
                        + "1 - Creditar\n2 - Debitar\n3 - Consultar saldo\n4 - Encerrar conta \n"
                        + "5 - Sair");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        if (c1.getTipo() != 4) {
                            System.out.println("Digite o valor a ser creditado: ");
                            c1.creditar(sc.nextInt());
                            System.out.println("\nSeu saldo atual é de " + c1.getSaldo());
                        } else {
                            System.out.println("Conta encerrada! Não é possivel realizar esta operação");
                        }

                        break;
                    case 2:
                        if (c1.getTipo() != 4) {
                            System.out.println("Digite o valor a ser debitado: ");
                            c1.debitar(sc.nextInt());
                            System.out.println("\nSeu saldo atual é de " + c1.getSaldo());
                        } else {
                            System.out.println("Conta encerrada! Não é possivel realizar esta operação");
                        }
                        break;
                    case 3:
                        System.out.println("Seu saldo atual é de " + c1.getSaldo());
                        break;
                    case 4:
                        if (c1.getSaldo() <= 0) {
                            c1.encerrarConta();
                            System.out.println(c1.textoEncerrar());
                        } else {
                            System.out.println("Não é possivel encerrar a conta, retire todo o dinheiro");
                        }
                        break;
                    case 5:
                        System.out.println("\nVolte sempre!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fim do programa");
            sc.close();
        }
    }
}

