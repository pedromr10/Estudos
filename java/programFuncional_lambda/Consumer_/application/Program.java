package programFuncional_lambda.Consumer_.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import programFuncional_lambda.Consumer_.util.PriceUpdate;
import programFuncional_lambda.Consumer_.model.entities.Product;

public class Program {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.00)); 

        //percorre os produtos da lista aplicando o consumer a cada elemento:
        //list.forEach(new PriceUpdate());

        //usando funcao static:
        //list.forEach(Product::staticPriceUpdate);
        
        //usando funcao nao static:
        //list.forEach(Product::nonStaticPriceUpdate);

        //lambda declarada:
        /* 
        Consumer<Product> cons = p->{
            p.setPrice(p.getPrice()*1.1);
        }; // ou Consumer<Product> cons = p->p.setPrice(p.getPrice()*1.1);
        list.forEach(cons);
        */

        //lambda inline:
        list.forEach( p->p.setPrice(p.getPrice()*1.1));

        list.forEach(System.out::println);
    }
}

//o consumer recebe um valor e nao retorna nada, so consome o objeto e faz alguma acao com ele