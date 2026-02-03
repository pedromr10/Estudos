import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int qtdRepeticoes = sc.nextInt();
        int num, soma = 0;
        for(int i = 0;i<qtdRepeticoes;i++){
            num = sc.nextInt();
            soma+=num;
        }
        System.out.println(soma);
    }
}
