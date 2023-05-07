import java.util.ArrayList;

public class Order {

    private ArrayList<Object> ingredients;
    private static String Bobi = "61c0c5a71d1f82001bdaaa6d";
    private static String canOfBeans = "61c0c5a71d1f82001bdaaa6f";

    public Order(ArrayList<Object> ingredients) {
        this.ingredients = ingredients;
    }

    public static Order getDefaultOrder() {
        ArrayList<Object> order = new ArrayList<>();
        order.add(Bobi);
        order.add(canOfBeans);

        return new Order(order);
    }

    public static Order getOrderIncorrectHash() {
        ArrayList<Object> order = new ArrayList<>();
        order.add("Qwer1234");
        order.add("1234");

        return new Order(order);
    }

    @Override
    public String toString() {
        return "Order{" +
                "ingredients=" + ingredients +
                '}';
    }

}
