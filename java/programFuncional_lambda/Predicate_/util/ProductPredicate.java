package programFuncional_lambda.Predicate_.util;

import java.util.function.Predicate;

import programFuncional_lambda.Predicate_.model.entities.Product;

public class ProductPredicate implements Predicate<Product>{
    @Override
    public boolean test(Product p){
        //excluir da lista os produtos com valor maior ou igual a 100
        return p.getPrice() >= 100.0;
        //se for maior ou igual a 100 - retorna true
        //se for menor que 100 - retorna false
    }
}
