package com.ait.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import com.ait.dao.CategoryDAO;
import com.ait.dao.CategoryDAOImpl;
import com.ait.entity.CategoryEntity;
import com.ait.entity.ProductEntity;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		CategoryDAO dao=new CategoryDAOImpl();
		
		//storing category entity
	/*	
		CategoryEntity category = new CategoryEntity();
		category.setCategoryId(101);
		category.setCategoryName("MyDP'S");
		ProductEntity p1 = new ProductEntity();
		ProductEntity p2 = new ProductEntity();
		ProductEntity p3 = new ProductEntity();
		p1.setProductId(1);
		p1.setProductName("MyDP1");
		p2.setProductId(2);
		p2.setProductName("MyDP2");
		p3.setProductId(3);
		p3.setProductName("MyDP3");
		try 
		{
			String imagePath1="C:\\Users\\ADMIN\\Downloads\\MyWallpapers\\MyDP1.jpg";
			String imagePath2="C:\\Users\\ADMIN\\Downloads\\MyWallpapers\\MyDP2.jpg";
			String imagePath3="C:\\Users\\ADMIN\\Downloads\\MyWallpapers\\MyDP3.jpg";
			File file1 = new File(imagePath1);
			File file2 = new File(imagePath2);
			File file3 = new File(imagePath3);
			
			byte iBytes1[]=new byte[ (int)file1.length() ];
			FileInputStream fis1 = new FileInputStream(file1);
			fis1.read(iBytes1);
			p1.setProductImage(iBytes1);
			
			byte iBytes2[]=new byte[ (int)file1.length() ];
			FileInputStream fis2 = new FileInputStream(file2);
			fis2.read(iBytes2);
			p2.setProductImage(iBytes2);
			
			byte iBytes3[]=new byte[ (int)file1.length() ];
			FileInputStream fis3 = new FileInputStream(file3);
			fis3.read(iBytes3);
			p3.setProductImage(iBytes3);
			
			category.setListOfProducts(List.of(p1,p2,p3));
			dao.saveCategory(category);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		*/
		
		//fetching category
		
		CategoryEntity entity = dao.fetchCategory(101);
		System.out.println("Category id : "+entity.getCategoryId());
        System.out.println("Category name : "+entity.getCategoryName());
        System.out.println("Products\n==================");
        entity.getListOfProducts().forEach(product->{
        	System.out.println(product.getProductId() +" "+product.getProductName());
        });
      
		
		//removing category and its corresponding product
		
		//dao.removeCategory(101);

		
	}
	
}
