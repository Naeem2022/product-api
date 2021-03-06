package in.ashokit.entity;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
@XmlRootElement
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Double productPrice;

}
