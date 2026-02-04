package orientacao_objeto.membros_estaticos.util;

public class Calculator {
    //aqui (versao 3) foi colocado o static pq ela nao muda nunca
    public static final double PI = 3.14159;

    //o mesmo vale para os metodos, uma vez que nao tem algo em especifico para diferenciar dois objetos, fazem operacoes simples apenas. Não usam atributos que mudam de um objeto para outro
    public static double circumference(double radius){
        return 2.0*PI*radius;
    }
    public static double volume(double radius){
        return (4.0*PI*Math.pow(radius, 3))/3;
    }
}


//obs: versao 3 - Se o comportamento do método não depende de dados específicos de um objeto, ele pode (e deve) ser static.