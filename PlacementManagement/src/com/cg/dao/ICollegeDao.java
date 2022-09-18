
package com.cg.dao;

import com.cg.entites.College;

public interface ICollegeDao 
{
	public abstract College addCollege(College college);
	public abstract College updateCollege(College college);
	public abstract College searchCollege(int id);
	public abstract boolean deleteCollege(int id);

	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
