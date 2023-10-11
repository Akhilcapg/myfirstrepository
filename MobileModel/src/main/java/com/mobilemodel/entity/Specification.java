package com.mobilemodel.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;



@Entity
@Table(name = "Specification")
public class Specification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "spec_id")
    private Long specId;

	
    @Column(name = "camera_pixels")
	
	  @NotEmpty
	   private String cameraPixels;

  @Column(name = "display_size")
  private String displaySize;

  @Column(name = "battery_life")
  private String batteryLife;

    public Long getSpecId() {
		return specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
	}

	public String getInternalMemory() {
		return internalMemory;
	}

	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}

	public String getCameraPixels() {
		return cameraPixels;
	}

	public void setCameraPixels(String cameraPixels) {
		this.cameraPixels = cameraPixels;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public String getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}

	@Column(name = "internal_memory")
	   private String internalMemory;

    
	
	
	 
   

    // Constructors, getters, and setters
}
