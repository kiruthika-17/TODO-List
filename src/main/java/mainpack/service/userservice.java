package mainpack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import mainpack.model.user;

import mainpack.repo.userrepo;
import springexception.DataNotFoundException;
import springexception.UserValidation;


@Service
@Transactional
public class userservice {

	private final userrepo ur;

	public userservice(userrepo ur) throws DataNotFoundException {
		this.ur=ur;
	}
	public void adduser(user usr) throws Exception {
		UserValidation.validateUser(usr);
		ur.save(usr);
	}
	
	public List<user> showAllUsers() {
		List<user> users=new ArrayList<>();
		ur.findAll().forEach(users::add);
		return users;
	}
	public void DeleteUser(int id) {
		Optional<user> usr= ur.findById(id);
		if(!usr.isPresent()) {
			throw new DataNotFoundException("No user found!!");
		}
		ur.deleteById(id);
		
	}
	public void Updateuser(user u,int id) {
		Optional<user> usr= ur.findById(id);
		if(!usr.isPresent()) {
			throw new DataNotFoundException("No user found!!");
		}
			ur.save(u);
		
	}
	public Optional<user> getuser(int id) throws Exception{
		
        Optional<user> usr= ur.findById(id);
		if(!usr.isPresent()) {
			throw new DataNotFoundException("No user found!!");
		}
		return usr;
	}
	
	

	

}