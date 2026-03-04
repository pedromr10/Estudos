package set_.exe1.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import set_.exe1.model.entities.User;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = "set_\\exe1\\application\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<User> set = new HashSet<>(); //mais rapido e a ordem nao importa
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(" ");
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new User(fields[0], moment)); //set nao permite infos iguais
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
