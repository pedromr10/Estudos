package estrutura_sequencial;

//importando o scanner:
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        //criando o scanner:
        Scanner sc = new Scanner(System.in);
        //capturando e imprimindo uma variavel string:
        String x;
        x = sc.next();
        System.out.println(x);
        //capturando e imprimindo uma variavel int:
        int y;
        y = sc.nextInt();
        System.out.println(y);
        //capturando e imprimindo uma variavel double:
        double z;
        z = sc.nextDouble();
        System.out.println(z);
        //capturando e imprimindo uma variavel char:
        char c;
        c = sc.next().charAt(0);
        System.out.println(c);
        //capturando e imprimindo ate a quebra de linha:
        sc.nextLine(); //tira a string vazia
        String s1;
        s1 = sc.nextLine();
        System.out.println(s1);


        sc.close();
    }
}

/*
OBS:

*/