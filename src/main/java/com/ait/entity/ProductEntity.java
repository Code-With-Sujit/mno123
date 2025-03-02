package com.ait.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_products")
public class ProductEntity {
	
	@Id
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Lob
	@Column(name = "product_image")
	private byte[] productImage;

	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(Integer productId, String productName, byte[] productImage) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", productImage="
				+ Arrays.toString(productImage) + "]";
	}
	
	
	
	

}
