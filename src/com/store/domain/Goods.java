package com.store.domain;

import java.util.List;

public class Goods {
	//�@���Ʈw�̤��|���U�ƽu�A�n�ﱼ
	//cpu_brand ,cpu_type ,memory_capacity ,hd_capacity,  card_model
	private long id;
	/* �ϥΪ̦W��  */
	private String name;
	/* ���B  */
	private Double price;
	/* ���~�y�z */
	private String description;
	/* �q���~�P */
	private String brand;
	/* CPU�~�P  */
	private String cpuBrand;
	/* CPU����  */
	private String cpuType;
	/* �O����e�q  */
	private String memoryCapacity;
	/* �w�Юe�q  */
	private String hdCapacity;
	/* ��ܥd����  */
	private String cardModel;
	/* �ù��ؤo  */
	private String displaysize;
	/* ���~�Ϥ� */
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
