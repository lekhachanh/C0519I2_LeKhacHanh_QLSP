package service;

import model.Product;
import repository.ProductRepository;

public class ProductService implements GeneralService <Product> {
    ProductRepository productRepository = new ProductRepository();


    @Override
    public Product[] showList() {
        return productRepository.showList();
    }

    @Override
    public int size() {
        return productRepository.size();
    }

    @Override
    public void add(int index, Product element) {
        productRepository.add(index, element);
    }

    @Override
    public Product edit(int index, Product element) {
        return productRepository.edit(index, element);
    }

    @Override
    public Product delete(int index) {
        return productRepository.delete(index);
    }

    @Override
    public int findName(String elementName) {
        return productRepository.findName(elementName);
    }

    @Override
    public void sort() {
        productRepository.sort();
    }
}
