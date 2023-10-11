package com.mobilemodel.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "Mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mobileId")
    private Long mobileId;
    @Column(name = "imeiNumber")
    private String imeiNumber;

    @Column(name = "color")
    private String color;
    @NotNull
    
    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private String status;

    @Column(name = "manufacturedDate")
    private Date manufacturedDate;

    public Long getMobileId() {
		return mobileId;
	}

	public void setMobileId(Long mobileId) {
		this.mobileId = mobileId;
	}

	public String getImeiNumber() {
		return imeiNumber;
	}

	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	

    

    // Constructors, getters, and setters
}
