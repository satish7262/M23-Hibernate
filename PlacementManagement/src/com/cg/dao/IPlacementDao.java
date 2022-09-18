package com.cg.dao;

import com.cg.entites.Placement;

public interface IPlacementDao 
{
	public abstract Placement addPlacement(Placement placement);
	public abstract Placement updatePlacement(Placement placement);
	public abstract Placement searchPlacement(int id);
	public abstract boolean cancelPlacement(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}

