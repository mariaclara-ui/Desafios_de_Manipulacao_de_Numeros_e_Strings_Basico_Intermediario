import java.util.Scanner;
public class Atividade_Sequencia_09_Dificil {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            int divisor = 2;
            System.out.println("O fator é equivlente a:" + numero + ":");

            while (numero > 1) {
                int contador = 0;
            }
            do {
                if (numero % divisor == 0) {
                    numero /= divisor;
                    numero++;
                } else {
                    break;
                }
            } while (numero % divisor == 0);
            if (numero> 0) {
                System.out.println(divisor + "^" + numero);
            }

        }

    }



