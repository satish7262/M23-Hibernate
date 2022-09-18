package com.cg.service;

import com.cg.entites.College;
import com.cg.entites.Placement;

public interface ICollegeService 
{
	public abstract College addCollege(College college);
	public abstract College updateColleget(College college);
	public abstract College searchCollege(int id);
	public abstract boolean deletePlacement(int id);
	public abstract College schdulePlacement(Placement placement);

}
