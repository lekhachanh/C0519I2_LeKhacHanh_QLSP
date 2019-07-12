package controller;

import model.Product;
import service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public Product [] showList() {
        return productService.showList();
    }

    public int size () {
        return productService.size();
    }

    public void add(int index, Product product) {
        productService.add(index, product);
    }

    public Product delete (int index) {
        return productService.delete(index);
    }

    public Product edit (int index, Product product) {
        return productService.edit(index, product);
    }

    public int findName (String product) {
        return productService.findName(product);
    }

    public void sort () {
        productService.sort();
    }

}
