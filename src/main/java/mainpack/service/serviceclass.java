package mainpack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainpack.model.modelclass;
import mainpack.repo.repository;
import springexception.DataNotFoundException;
import springexception.TaskValidation;

@Service
@Transactional
public class serviceclass {

	
	@Autowired
	private final repository tr;
	

	public serviceclass(repository tr) {
		this.tr=tr;
	}
	public void addTask(modelclass td) throws Exception {
		TaskValidation.validateTask(td);
		tr.save(td);
	}
	
	public List<modelclass> showAllTasks(int todoid) {
		List<modelclass> todos=new ArrayList<>();
		tr.findAll().forEach(todos::add);
		return todos;
	}
	public void DeleteTask(int id) {
		Optional<modelclass> m= tr.findById(id);
		if(!m.isPresent()) {
			throw new DataNotFoundException("No task found!!");
		}
		tr.deleteById(id);
		
	}

	public Optional<modelclass> getTask(int id) {
		Optional<modelclass> m= tr.findById(id);
		if(!m.isPresent()) {
			throw new DataNotFoundException("No task found!!");
		}
		return tr.findById(id);
	}
	public void Updatetask(modelclass td,int id) {
		Optional<modelclass> m= tr.findById(id);
		if(!m.isPresent()) {
			throw new DataNotFoundException("No task found!!");
		}
	tr.save(td);
		
	}
	
	

	

}