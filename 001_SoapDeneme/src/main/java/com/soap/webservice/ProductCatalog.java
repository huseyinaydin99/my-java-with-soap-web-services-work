package com.soap.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "urunKatologu", portName = "urunKataloguPortu",serviceName = "urunKatalogu")
public interface ProductCatalog {
    
    @WebMethod(action = "katagorileriCek",operationName = "kategorilerinCekilmesi")
    public List<String> getAllProductCatagories();
    
    @WebMethod(action = "urunleriCek",operationName = "urunlerinCekilmesi")
    public List<String> getAllProduct(@WebParam(name = "urun",partName = "urun")String product);
    
    @WebMethod(action = "urunCek",operationName = "urunCekilmesi")
    @WebResult(name = "Product")
    public List<Product> getProductsv2();
    
    @WebMethod(action = "urunEkle",operationName = "urunEklenmesi")
    public boolean addProduct(@WebParam(name = "kategori",partName = "kategori")String catagori,@WebParam(name = "urun",partName = "urun")String product);
    
    @WebMethod(action = "urunSil",operationName = "urunSilinmesi")
    @WebResult(name = "Product")
    public Product deleteProduct(@WebParam(name = "urun",partName = "urun")Product product);
    
    @WebMethod(action = "urunSill2",operationName = "urunSilinmesii2")
    @WebResult(name = "Product")
    public Product deleteProduct2(@WebParam(name = "index",partName = "index")int index);
    
    @WebMethod(action = "urunGuncelle",operationName = "urunGuncellenmesi")
    @WebResult(name = "Product")
    public Product updateProduct(@WebParam(name = "urun",partName = "urun")Product product,@WebParam(name = "index",partName = "index")int index);
    
    @WebMethod(action = "stringEkle",operationName = "stringEklenmesi")
    @WebResult(name = "metin2")
    public String addString(@WebParam(name = "abc",partName = "abc")String abc);
}