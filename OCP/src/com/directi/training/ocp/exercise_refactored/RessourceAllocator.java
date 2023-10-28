package com.directi.training.ocp.exercise_refactored;


public class RessourceAllocator {
	 private static final int INVALID_RESOURCE_ID = -1;
	 public int allocate(Ressource ressource)
	    {
		 int id;
		 try {
			 id=ressource.findFreeSlot();
			 ressource.markSlotBusy(id);
	     return(id);
		 }
		 catch(Exception e){
			 System.out.println("ERROR: Attempted to allocate invalid resource");
	         id= INVALID_RESOURCE_ID;
	    	}
		 return(id);
	    }

	    public void free(Ressource ressource, int resourceId)
	    {
	    	try {
	    		ressource.markSlotFree(resourceId);
	    	}
	    	catch(Exception e){
	    		System.out.println("ERROR: attempted to free invalid resource");
	    	}
	     
	    }

}
