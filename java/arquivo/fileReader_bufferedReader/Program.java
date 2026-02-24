package arquivo.fileReader_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String path = "arquivo\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        //a instancia do arquivo fica no try pois pode gerar algumas excecoes, como nao ter o arquivo, caminho errado, etc:
        try{
            fr = new FileReader(path);
            //o bufferedreader é instanciado a partir do filereader, deixa a leitura mais rapida e flexivel:
            br = new BufferedReader(fr);

            String line = br.readLine(); //quando chega no fim do arquivo, retorna null, por isso o proximo while:
            while (line!=null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                //para fechar buffered e filereader, tem de tratar exception
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
