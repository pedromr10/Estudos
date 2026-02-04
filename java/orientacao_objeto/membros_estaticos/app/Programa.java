package orientacao_objeto.membros_estaticos.app;

import java.util.Scanner;
import orientacao_objeto.membros_estaticos.util.Calculator;

public class Programa {
    /*obs: palavras constantes costumam ser instanciadas em letras maiusculas e em caso de mais de uma palavra, usar underline, ex:
    public static final double NET_SALARY; 
    */

    //o final indica que a variável não poderá ser alterada:
    //public static final double PI = 3.14159;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //como os membros da classe (calculator) nao sao estaticos vc é obrigado a instanciar um objeto:
        //Calculator calc = new Calculator();
        double radius, c, v;

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();
        //versao 3 - nao precisa instanciar um objeto, pode-se usar apenas seus metodos, uma vez que nao se alteram, pois sao simples contas
        c = Calculator.circumference(radius);
        v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        //versao 3 - pode-se colocar como Calculator.PI pois PI pertence à classe Calculator, nao aos seus objetos
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
    /*funcao dentro da main usa o static e em objeto nao usa, pq "metodo static so chama metodo static diretamente". Utilizada tbm em funcoes utilitarias genericas
    public static double circumference(double radius){
        return 2.0*PI*radius;
    }
    public static double volume(double radius){
        return (4.0*PI*Math.pow(radius, 3))/3;
    }
    */

}
