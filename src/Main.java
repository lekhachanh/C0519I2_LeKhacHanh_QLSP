import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        int index;
        int size = productController.size();
        Product [] listproducts = productController.showList();


        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    if (size == 0) {
                        System.out.println("No products in list");
                        break;
                    }
                    System.out.println("Lists products: ");
                    for (int i = 0; i<size; i++) {
                        System.out.println(listproducts[i]);
                    }
                    break;
                }
                case 2: {
                    if (listproducts.length == size) {
                        System.out.println("Full products");
                        break;
                    }
                    System.out.println("add product in index? ");
                    index = input.nextInt();
                    if (index < 0 || index >= listproducts.length) {
                        System.out.println("index is not exist");
                        break;
                    }
                    Product product = new Product();
                    System.out.println("Input information of product");
                    product.getInforProduct();
                    productController.add(index, product);
                    System.out.println("add product success!");
                    size ++;
                    break;

                }
                case 3: {
                    if (size == 0) {
                        System.out.println("Empty product");
                        break;
                    }
                    System.out.println("detele product in index");
                    index = input.nextInt();
                    if (index < 0 || index >= size) {
                        System.out.println("index is not exist");
                        break;
                    }
                    productController.delete(index);
                    System.out.println("delete cucess");
                    size--;
                    break;
                }
            }

        }while (choice != 0);

    }

    public static void menu () {
        System.out.println("Product Manage");
        System.out.println("1. List Products");
        System.out.println("2. Add products");
        System.out.println("3. Delete products");
        System.out.println("4. Edit products");
        System.out.println("5. Find name product");
        System.out.println("6. cancel");
    }


}
