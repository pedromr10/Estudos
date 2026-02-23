package exceptions.finally_.application;

public class Program {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0; // Vai gerar ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }

        System.out.println("Programa continua normalmente.");
    }
}
/*
O finally em Java serve para garantir que um bloco de código será executado independentemente de ocorrer ou não uma exceção.
*/