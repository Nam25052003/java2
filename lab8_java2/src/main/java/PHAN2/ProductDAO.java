package PHAN2;

import java.io.Serializable;

public class ProductDAO extends DAO<Product> {

    @Override
    public void update(Product entity) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).name.equalsIgnoreCase(entity.name)) {
                ls.set(i, entity);
            }
        }

    }

    @Override
    public Product find(Serializable id) {
        for (Product p : ls) {
            if (p.name.equals(id)) {
                return p;
            }
        }
        return null;
    }

}
