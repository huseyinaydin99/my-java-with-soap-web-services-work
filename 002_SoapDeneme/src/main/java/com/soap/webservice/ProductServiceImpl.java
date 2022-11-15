package com.soap.webservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hüseyin
 */
public class ProductServiceImpl implements ProductService {

    private List<String> mobilya = new ArrayList<>();
    private List<String> beyazEsya = new ArrayList<>();
    private List<String> elektronik = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public ProductServiceImpl() {
        super();
        System.out.println("Hazýrlandý!");
        products.add(new Product("A", "B", 55.5));
        products.add(new Product("X", "T", 54.5));
        products.add(new Product("C", "G", 53.5));

        mobilya.add("Kanepe");
        mobilya.add("Masa");
        mobilya.add("Sandalye");

        beyazEsya.add("Buz dolabý");
        beyazEsya.add("Çamaþýr makinesi");
        beyazEsya.add("Bulaþýk makinesi");

        elektronik.add("Tablet");
        elektronik.add("Telefon");
        elektronik.add("Laptop");
    }

    @Override
    public List<String> getAllProductCatagories() {
        List<String> productCatagories = new ArrayList<>(Arrays.asList("mobilya", "beyaz eþya", "elektronik"));
        return productCatagories;
    }

    @Override
    public List<String> getAllProduct(String product) {
        switch (product) {
            case "mobilya":
                return mobilya;
            case "beyaz eþya":
                return beyazEsya;
            case "elektronik":
                return elektronik;
            default:
                List<String> r = new ArrayList<>();
                r.add("Lütfen aþaðýda ki deðerlerden birini giriniz.");
                r.add("mobilya,");
                r.add("beyaz eþya,");
                r.add("elektronik");
                return r;
        }
    }

    @Override
    public boolean addProduct(String catagori, String product) {
        switch (catagori.toLowerCase()) {
            case "mobilya":
                mobilya.add(product);
                return true;
            case "beyaz eþya":
                beyazEsya.add(product);
                return true;
            case "elektronik":
                elektronik.add(product);
                return true;
            default:
                return false;
        }
    }

    @Override
    public List<Product> getProductsv2() {
        return products;
    }

    @Override
    public Product deleteProduct(Product product) {
        Product product1 = product;
        products.remove(product1);
        System.out.println("Silindi!");
        return product1;
    }

    @Override
    public Product deleteProduct(int index) {
        Product product = products.get(index);
        products.remove(index);
        return product;
    }

    @Override
    public Product updateProduct(Product product, int index) {
        products.set(index, product);
        return product;
    }

}
