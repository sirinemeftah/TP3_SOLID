package com.directi.training.ocp.exercise_refactored;

public abstract class Ressource {
	int resourceId;
	
	public abstract void markSlotBusy(int resourceId);
    public abstract int findFreeSlot();
    public abstract void markSlotFree(int resourceId);
   
}
