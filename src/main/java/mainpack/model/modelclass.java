package mainpack.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;
import main.pack.todoenum.Status;

@Entity
@Data
@NoArgsConstructor
@Table(name="FirstTable")
public class modelclass {
	
	@Id
	private int taskid;
	private String name;
	private String description;
	private Date createdOn;
	private Date deadline;
	@Enumerated(EnumType.STRING)
	private Status status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="todoid")
	private todomodelclass todomodel;
	
	public modelclass(int taskid, String name, String description, int todoid) {
		super();
		this.taskid = taskid;
		this.name = name;
		this.description = description;
		this.todomodel=new todomodelclass(todoid,"",0);
		
	}

}