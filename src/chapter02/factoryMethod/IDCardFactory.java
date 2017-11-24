package chapter02.factoryMethod;

import chapter02.factoryMethod.framework.Factory;
import chapter02.factoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List<String> owers = new ArrayList<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owers.add(((IDCard)product).getOwner());
    }

    public List<String> getOwers() {
        return owers;
    }
}
