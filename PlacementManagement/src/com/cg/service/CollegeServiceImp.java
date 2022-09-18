package com.cg.service;

import com.cg.dao.CollegeDaoImp;
import com.cg.dao.ICollegeDao;
import com.cg.entites.College;
import com.cg.entites.Placement;

public class CollegeServiceImp implements ICollegeService {
	
	private ICollegeDao  dao;

	public CollegeServiceImp() {
		super();
		dao=new CollegeDaoImp();
	}

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
		
	}

	@Override
	public College updateColleget(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
		
	}

	@Override
	public College searchCollege(int id) {
		College college=dao.searchCollege(id);
		return college;
		
		
	}

	@Override
	public boolean deletePlacement(int id) {
		dao.beginTransaction();
		boolean res=dao.deleteCollege(id);
		dao.commitTransaction();
		return res;
		
	}

	@Override
	public College schdulePlacement(Placement placement) {
	
		return null;
		
		
	}

	

}
