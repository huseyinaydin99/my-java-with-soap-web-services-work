package com.soap.webservice;

import java.util.List;

public interface ProductService {
	public List<String> getAllProductCatagories();
    public List<String> getAllProduct(String product);
    public List<Product> getProductsv2();
    public boolean addProduct(String catagori, String product);
    public Product deleteProduct(Product product);
    public Product deleteProduct(int index);
    public Product updateProduct(Product product,int index);
}
