package repository;

import model.Product;

public class ProductRepository implements GeneralRepository<Product> {
    Product[] listProducts = new Product[SIZE];

    @Override
    public Product[] showList() {
        return listProducts;
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < SIZE; i++) {
            if (listProducts[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public void add(int index, Product product) {
        if (size() == 0) {
            listProducts[0] = product;
        } else if (index >= size()) {
            listProducts[size()] = product;
        } else {
            Product[] newListProducts = new Product[SIZE];
            for (int i = 0; i < index; i++) {
                newListProducts[i] = listProducts[i];
            }
            newListProducts[index] = product;
            for (int i = index + 1; i < SIZE; i++) {
                newListProducts[i] = listProducts[i - 1];
            }
            for (int i = 0; i < SIZE; i++) {
                listProducts[i] = newListProducts[i];
            }
        }
    }

    @Override
    public Product delete(int index) {
        Product temp = listProducts[index];
        for (int i = index; i < SIZE - 1; i++) {
            listProducts[i] = listProducts[i + 1];
        }
        return temp;
    }

    @Override
    public Product edit(int index) {
        return listProducts[index];
    }

    @Override
    public int findName(String productName) {
        int index = -1;
        for (int i = 0; i < SIZE; i++) {
            if (listProducts[i].getName().equalsIgnoreCase(productName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size(); j++) {
                Product temp = listProducts[i];
                listProducts[i] = listProducts[j];
                listProducts[j] = temp;
            }

        }

    }
}
