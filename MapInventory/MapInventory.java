import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        // your code here
        if (inventory.containsKey(productId)){
            return inventory.get(productId);
        }
        return -1;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        // your code here
        List<String> productIDs = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: inventory.entrySet()){
            if (entry.getValue() == price){
                productIDs.add(entry.getKey());
            }
        }

        return productIDs;
    }
}