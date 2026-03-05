package programFuncional_lambda.Consumer_.util;

import java.util.function.Consumer;
import programFuncional_lambda.Consumer_.model.entities.Product;

public class PriceUpdate implements Consumer<Product>{
    

    @Override
    public void accept(Product p){
        //aumenta o preco em 10%
        p.setPrice(p.getPrice() * 1.1);

    }
}
