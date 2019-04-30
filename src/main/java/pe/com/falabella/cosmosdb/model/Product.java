package pe.com.falabella.cosmosdb.model;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
@ToString
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    private ObjectId _id;
    private String name;
    private String description;

}
