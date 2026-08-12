import java.util.*;

class InventoryService {

    private Map<String, Integer> stock;

    public InventoryService(Map<String, Integer> stock) {
        this.stock = stock;
    }

    public void removeOutOfStockItems() {
        List<String> emptyStock = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue().equals(0)) {
                emptyStock.add(entry.getKey());
            }
        }
        for (String i : emptyStock) {
            stock.remove(i);
        }
    }

    public Map<String, Integer> getStock() {
        return stock;
    }
}
