package programFuncional_lambda.Predicate_.model.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    //obs: metodo estatico trabalha com o produto passado como argumento (Product p)
    public static boolean staticPredicate(Product p){
        return p.getPrice() >= 100;
    }

    //obs: metodo nao estatico trabalha com o proprio objeto que estou
    public boolean nonStaticPredicate(){
        return price >= 100;
    }

    @Override
    public String toString(){
        return getName() + " " + getPrice();
    }
}
