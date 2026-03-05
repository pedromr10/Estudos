package programFuncional_lambda.Function_.util;

import java.util.function.Function;

import programFuncional_lambda.Function_.model.entities.Product;;

public class UpperCaseName implements Function<Product, String>{
    //deixar a string em uppercase
    @Override
    public String apply(Product p){
        return p.getName().toUpperCase();
    }
}
