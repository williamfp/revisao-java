package FunctionalProgramming.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
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

    //Implemented as part of Solution #2 (Predicate)
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }

    //Implemented as part of Solution #3 (Predicate)
    public boolean nonStaticProductPredicate(){
        return this.getPrice() >= 100;
    }

    //Implemented as part of Solution #2 (Consumer)
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    //Implemented as part of Solution #3 (Consumer)
    public void nonStaticPriceUpdate(){
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }
}
