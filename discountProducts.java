import java.util.*;

public class discountProducts {
    static void applyDiscount(Map<String, Integer> prices) {
        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            String product = entry.getKey();
            Integer price = entry.getValue();

            if (price > 10000) {
                int discountedPrice = price - ((price * 10) / 100);

                prices.put(product, discountedPrice);
            }
        }
    }
}