package mainpack.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.Data;


/*
 *  @author kiruthika
 */

@Entity
@Data
@Table(name="TodoTable")
public class todomodelclass {
	
	@Id
 private int todoid;
 private String name;
 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name="userid")
 private user u;
 
 public todomodelclass() {
		super();
	}

public todomodelclass(int todoid, String name, int userid) {
	super();
	this.todoid = todoid;
	this.name = name;
	this.u=new user(userid,"","");
}
 
}
