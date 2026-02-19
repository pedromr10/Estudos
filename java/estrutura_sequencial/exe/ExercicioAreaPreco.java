package estrutura_sequencial.exe;

import java.util.Scanner;

public class ExercicioAreaPreco {
    public static void main(String[] args){
        //instanciando variaveis e scanner:
        double largura, comprimento, valor;
        Scanner sc = new Scanner(System.in);
        //recebendo os dados:
        largura = sc.nextDouble();
        comprimento = sc.nextDouble();
        valor = sc.nextDouble();
        //manipulacao dos dados:
        System.out.printf("AREA = %.2f%n", largura*comprimento);
        System.out.printf("PRECO = %.2f%n", (largura*comprimento) * valor);

    }
}
