public class CatFood implements ISellable {
    public String description() {
        return "Yummy cat food";
    }

    public double unitPrice() {
        return 20.99;
    }

    public String sku() {
        return "cf0001";
    }
}