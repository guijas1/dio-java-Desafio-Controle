import java.util.Scanner;

public class Controle {
    public static void main(String[] args) throws Exception {
        Scanner termi = new Scanner(System.in);
        System.out.println("Digite o numero do parametro");
        int parametroUm = termi.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = termi.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalidoException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

    private static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroDois <= parametroUm)
            throw new ParametroInvalidoException();
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero " + (i));
        }
    }
}