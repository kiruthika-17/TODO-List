package springexception;

import mainpack.model.user;

public class UserValidation {

	public static void validateUser(user u) throws Exception{
		 
		if(u.getUserid()==0||u.getUname()==null||u.getUpass()==null ){
	  
			throw new DataNotFoundException("Not Found");
		}
		
	}
}
