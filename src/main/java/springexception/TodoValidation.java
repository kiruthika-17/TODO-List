package springexception;

import mainpack.model.todomodelclass;

public class TodoValidation {

	public static void validateTask(todomodelclass todom) throws DataNotFoundException {
		
		if(todom.getTodoid()==0||todom.getName()==null) {
			
			throw new DataNotFoundException("Not Found");
		}
		
	}

	
}
