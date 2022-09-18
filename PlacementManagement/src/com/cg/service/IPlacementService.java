package com.cg.service;

import com.cg.entites.Placement;

public interface IPlacementService 
{
	public abstract Placement addPlacement(Placement placement);
	public abstract Placement updatePlacement(Placement placement);
	public abstract Placement searchPlacement(int id);
	public abstract boolean cancelPlacement(int id);


}
