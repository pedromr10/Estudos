package estrutura_condicional;

public class EstruturaCondicional{
    public static void main(String[] args){
        int x = 18;
        if(x < 12){
            System.out.println("Bom dia");
        }
        else if(x >= 12 && x<17){
            System.out.println("Boa tarde");
        }
        else{
            System.out.println("Boa noite");
        }
    }
}