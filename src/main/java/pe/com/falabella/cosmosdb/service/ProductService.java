package pe.com.falabella.cosmosdb.service;

import java.util.List;

import pe.com.falabella.cosmosdb.model.Product;

public interface ProductService {
	
List<Product> findProductByName(String name);
Product createProduct(Product product) ;
void deleteProduct(String name);

}
 