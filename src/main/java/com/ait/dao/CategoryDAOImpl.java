package com.ait.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.entity.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCategory(CategoryEntity entity) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		try 
		{
			tx.begin();
			manager.persist(entity);
			tx.commit();
			manager.close();
			System.out.println("Category and product stored successfully");
		} 
		catch (Exception e) 
		{
			tx.rollback();
			e.printStackTrace();
			System.err.println("Category not saved");
		}
		
		

	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager manager = factory.createEntityManager();
		CategoryEntity entity = manager.find(CategoryEntity.class, categoryId);
		manager.close();
		return entity;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		CategoryEntity entity = manager.find(CategoryEntity.class, categoryId);
		try 
		{
			tx.begin();
			manager.remove(entity);
			tx.commit();
			System.out.println("Category and products deleted succssfully");
		} 
		catch (Exception e) 
		{
			tx.rollback();
			e.printStackTrace();
		}
		
	}

}
