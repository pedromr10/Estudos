package programFuncional_lambda.Predicate_.application;

import java.util.ArrayList;
import java.util.List;

import programFuncional_lambda.Predicate_.model.entities.Product;
import programFuncional_lambda.Predicate_.util.ProductPredicate;

public class Program {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.00));

        //tirando os produtos que custam mais de 100 reais:
        list.removeIf(new ProductPredicate());

        for(Product p : list){
            System.out.println(p);
        }
    }
}
