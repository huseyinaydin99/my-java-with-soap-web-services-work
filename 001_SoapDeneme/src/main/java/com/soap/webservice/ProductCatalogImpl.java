package com.soap.webservice;

import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Hüseyin
 */
@WebService(endpointInterface = "com.soap.webservice.ProductCatalogImpl")
//@SOAPBinding(style = Style.RPC) endpoint interface var sa baþarýlý olmaz
public class ProductCatalogImpl implements ProductCatalog {

    private ProductService productService = new ProductServiceImpl();

    @Override
    public List<String> getAllProductCatagories() {
        return productService.getAllProductCatagories();
    }

    @Override
    public List<String> getAllProduct(String product) {
        return productService.getAllProduct(product);
    }

    @Override
    public boolean addProduct(String catagori,String product) {
        return productService.addProduct(catagori, product);
    }

    @Override
    public List<Product> getProductsv2() {
        return productService.getProductsv2();
    }

    @Override
    public Product deleteProduct(Product product) {
        return this.productService.deleteProduct(product);
    }

    @Override
    public Product deleteProduct2(int index) {
        return this.productService.deleteProduct(index);
    }

    @Override
    public Product updateProduct(Product product,int index) {
        return this.productService.updateProduct(product, index);
    }

    @Override
    public String addString(String abc) {
        return abc + " abc";
    }
}

