package com.cg.service;

import com.cg.dao.PlacementeDaoImp;
import com.cg.entites.Placement;

public class PlacementServiceImp implements IPlacementService{
	
	private PlacementeDaoImp  dao;
	
	public PlacementServiceImp() {
		super();
		dao=new PlacementeDaoImp();
	}
	
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return null;
	}
	
	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return null;
	}
	
	@Override
	public Placement searchPlacement(int id) {
		Placement placement=dao.searchPlacement(id);
		return placement;
	}
	
	@Override
	public boolean cancelPlacement(int id) {

		dao.beginTransaction();
		boolean res1 = dao.cancelPlacement(id);
		dao.commitTransaction();
		return res1;
	}
		
		
	}
