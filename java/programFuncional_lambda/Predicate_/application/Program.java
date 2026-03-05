package programFuncional_lambda.Predicate_.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import programFuncional_lambda.Predicate_.model.entities.Product;
import programFuncional_lambda.Predicate_.util.ProductPredicate;

public class Program {
    public static void main(String[] args) {
        List <Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.00));

        //tirando os produtos que custam mais de 100 reais, por meio de predicate:
        //list.removeIf(new ProductPredicate());

        //tirando os produtos que custam mais de 100 reais, por meio de method reference estatico:
        //obs: nao da pra usar Product.staticPredicate() pois a funcao removeIf tambem espera uma funcao. Ao usar o Product.staticPredicate(), voce vai estar recebendo o RESULTADO da funcao.
        //list.removeIf(Product::staticPredicate);

        //tirando os produtos que custam mais de 100 reais, por meio de method reference nao estatico:
        //list.removeIf(Product::nonStaticPredicate);

        //por meio de funcao lambda declarada:
        //Predicate<Product> pred = p-> p.getPrice()>=100;
        //list.removeIf(pred);

        //por meio da funcao lambda inline:
        list.removeIf(p->p.getPrice()>=100);

        for(Product p : list){
            System.out.println(p);
        }
    }
}
