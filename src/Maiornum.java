import java.util.Scanner;

public class Maiornum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor;
        int cont = 1;
        int maior = Integer.MIN_VALUE;

        while (cont <= 5) {
            System.out.print("Valor --> ");
            valor = sc.nextInt();
            if(valor > maior) {
                maior = valor;
            }
            cont = cont + 1;
        }
        System.out.println("Maior número é --> " + maior);
    }
}
