import java.util.HashMap;

public class InventorySystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public static void updateProduct(int id, int qty) {
        if(inventory.containsKey(id))
            inventory.get(id).quantity = qty;
    }

    public static void deleteProduct(int id) {
        inventory.remove(id);
    }

    public static void main(String[] args) {

        addProduct(new Product(1,"Laptop",10,50000));

        updateProduct(1,15);

        System.out.println(inventory.get(1));

        deleteProduct(1);
    }
}