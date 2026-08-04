import java.util.Scanner;

public class exercicio9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int valor;
        int total = 0;

        System.out.print("Informe um valor inteiro e positivo: ");
        valor = sc.nextInt();

        if(valor < 2) {
            System.out.println("O valor deve ser maior ou igual a 2");
        }
        else {
            for(int cont = 1; cont <= valor; cont++) {
                if(valor % cont == 0) {
                    total++;
                }
            }
            if(total == 2) {
                System.out.println("É primo");
            }
            else {
                System.out.println("Não é primo");
            }
        }
    }
}
