package mainpack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 *  @author kiruthika
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {

	@Id
	@Column(unique = true, nullable = false)
	private int userid;
	private String uname;
	private String upass;
	
}
