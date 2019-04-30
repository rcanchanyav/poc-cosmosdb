package pe.com.falabella.cosmosdb.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.falabella.cosmosdb.model.Product;
import pe.com.falabella.cosmosdb.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> findProductByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Product createProduct(Product product) {
		   product.set_id(ObjectId.get());
	return repository.save(product);
	}

	@Override
	public void deleteProduct(String name) {
		repository.deleteByName(name);
	}
}
