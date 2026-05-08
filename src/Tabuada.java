import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor, contador = 1, resultado;

            System.out.print("Valor --> ");
            valor = sc.nextInt();
            while (contador <= 10) {
                resultado = valor * contador;
                System.out.println(valor + " x " + contador + " = " + resultado);
                contador = contador + 1;

            }
        }


    }

