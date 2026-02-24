package arquivo.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("arquivo\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            //verifica se existe uma proxima linha no arquivo:
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            //fecha o arquivo independente se deu certo o try ou nao. é uma boa prática fechar o arquivo com finally:
            if(sc!=null){
                sc.close();
            }
        }
    }
}
