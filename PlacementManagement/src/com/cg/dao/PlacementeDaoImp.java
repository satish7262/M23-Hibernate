package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entites.Placement;

public class PlacementeDaoImp implements IPlacementDao {
	
	private EntityManager em;
	

	public PlacementeDaoImp() {
		super();
		em = JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement=em.find(Placement.class,id);
		return placement;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
	@Override
	public boolean cancelPlacement(int id) {
		Placement placement = searchPlacement(id);
		em.remove(placement);
		return true;
	}

}
