package pe.com.falabella.cosmosdb.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.falabella.cosmosdb.model.Product;

@Repository
//@RepositoryRestResource(collectionResourceRel = "product", path = "product")
//public interface ProductRepository extends DocumentDbRepository<Product, String>{
public interface ProductRepository extends MongoRepository<Product, ObjectId>{	
	List<Product> findByName(String firstName);
	void deleteByName(String name);
}
