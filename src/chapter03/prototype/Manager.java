package chapter03.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> showccase = new HashMap<>();

    public void register(String name, Product proto) {
        showccase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showccase.get(protoName);
        return p.createClone();
    }
}
