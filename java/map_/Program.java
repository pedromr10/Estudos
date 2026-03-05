package map_;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        //inserir usando put:
        cookies.put("username", "Pedro"); //chave, valor
        cookies.put("email", "pedro@gmail.com"); //chave, valor
        cookies.put("phone", "119999999"); //chave, valor

        cookies.remove("email");
        cookies.put("phone", "118888888");

        System.out.println("Contem a chave phone? " + cookies.containsKey("phone"));

        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("email: " + cookies.get("email"));

        for(String key : cookies.keySet()){ //keyset pega as chaves do map
            System.out.println(key + " : " + cookies.get(key)); //treemap ordenou por string (alfabetica)
        }
        
    }
}
