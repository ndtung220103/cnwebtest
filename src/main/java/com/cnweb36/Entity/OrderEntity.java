package com.cnweb36.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


// tên thông thường nó bị trùng với syntax trong sql
@Entity
@Table(name="_order")
public class OrderEntity extends BaseEntity {

	@Column(name="_quantity")
	private Integer quantity;
	
	@Column(name="_price")
	private Float price;
	
	@Column(name="_rate")
	private Integer rate;
	
	@Column(name="_comment")
	private String comment;
	
	@Column(name="_like")
	private Integer like;
	
	@Column(name="_dislike")
	private Integer dislike;
	
	

	public OrderEntity() {
		super();
	}

	public OrderEntity(Integer quantity, Float price, Integer rate, String comment, Integer like, Integer dislike) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.rate = rate;
		this.comment = comment;
		this.like = like;
		this.dislike = dislike;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public Integer getDislike() {
		return dislike;
	}

	public void setDislike(Integer dislike) {
		this.dislike = dislike;
	}
	
	
	
}
