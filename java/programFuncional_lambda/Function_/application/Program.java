package programFuncional_lambda.Function_.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import programFuncional_lambda.Function_.model.entities.Product;
import programFuncional_lambda.Function_.util.UpperCaseName;

public class Program {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.00));

        //a funcao map (nao a estrutura de dados Map) é uma funcao que aplica uma funcao a todos os elementos de uma stream. map so funciona em stream
        //list para stream: .stream()
        //stream para list: .collect(Collectors.toList())

        //usando interface:
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //usando metodo estatico:
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //usando metodo nao estatico:
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //usando lambda declarada:
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        //usando lambda inline:
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
