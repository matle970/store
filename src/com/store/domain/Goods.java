package com.store.domain;

import java.util.List;

public class Goods {
	//一般資料庫裡不會有下滑線，要改掉
	//cpu_brand ,cpu_type ,memory_capacity ,hd_capacity,  card_model
	private long id;
	/* 使用者名稱  */
	private String name;
	/* 金額  */
	private Double price;
	/* 產品描述 */
	private String description;
	/* 電腦品牌 */
	private String brand;
	/* CPU品牌  */
	private String cpuBrand;
	/* CPU型號  */
	private String cpuType;
	/* 記憶體容量  */
	private String memoryCapacity;
	/* 硬碟容量  */
	private String hdCapacity;
	/* 顯示卡型號  */
	private String cardModel;
	/* 螢幕尺寸  */
	private String displaysize;
	/* 產品圖片 */
	private String image;
	
	
//	private List<OrderLineItem> orderLineItems;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpuBrand() {
		return cpuBrand;
	}
	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}
	public String getCpuType() {
		return cpuType;
	}
	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}
	public String getMemoryCapacity() {
		return memoryCapacity;
	}
	public void setMemoryCapacity(String memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}
	public String getHdCapacity() {
		return hdCapacity;
	}
	public void setHdCapacity(String hdCapacity) {
		this.hdCapacity = hdCapacity;
	}
	public String getCardModel() {
		return cardModel;
	}
	public void setCardModel(String cardModel) {
		this.cardModel = cardModel;
	}
	public String getDisplaysize() {
		return displaysize;
	}
	public void setDisplaysize(String displaysize) {
		this.displaysize = displaysize;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
