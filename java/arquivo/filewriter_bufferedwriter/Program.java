package arquivo.filewriter_bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{
            "Good Morning", "Good afternoon", "Good night"
        };
        String path= "arquivo\\filewriter_bufferedwriter\\out.txt";
        //quando usa o true, ao lado de path, indica que nao quer recriar o arquivo, mas adicionar a ele
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine(); //quebra de linha
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
