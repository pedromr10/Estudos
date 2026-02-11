package vetor;

public class ForEach {
    public static void main(String[] args){
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        /*
        estrutura do foreach:

        for(tipo nomeDeCadaElemento : nomeDaColecao/Vetor/arraylist){
            funcao
        }
        
        */

        for(String element : vect){
            System.out.println(element);
        }
    }
}
