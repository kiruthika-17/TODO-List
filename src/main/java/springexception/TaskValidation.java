package springexception;

import mainpack.model.modelclass;

public class TaskValidation{


	public static void validateTask(modelclass td) throws Exception{
	 
		if(td.getTaskid()==0||td.getDescription()==null||td.getName()==null||td.getStatus()==null||td.getCreatedOn()==null||td.getDeadline()==null ){
	  
			throw new DataNotFoundException("Not Found");
		}
		
	}

}
