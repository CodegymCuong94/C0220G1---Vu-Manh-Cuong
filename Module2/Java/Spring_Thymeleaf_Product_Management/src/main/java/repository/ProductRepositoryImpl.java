package repository;

import model.Product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository(value = "productReport")
public class ProductRepositoryImpl implements ProductRepository {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iphone6", 100, 500));
        products.put(2, new Product(2, "iphone7", 200, 700));
        products.put(3, new Product(3, "iphone8", 300, 800));
        products.put(4, new Product(4, "iphone10", 400, 900));
        products.put(5, new Product(5, "iphone5", 50, 400));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.id, product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
