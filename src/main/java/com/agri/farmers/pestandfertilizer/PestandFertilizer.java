package com.agri.farmers.pestandfertilizer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "pesticidesandfertilizers")
public class PestandFertilizer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	//id name cost packagingsize companyname croptoapply targetpests dose productdescription
	
	@Column(nullable = false, length = 256)
	@NotNull @Length(min = 5, max = 256)
	private String name;
	
	private String cost;
	
	//@Column(length = 128)
	private String packagingsize;
	
	private String companyname;
	
	// @Min(value = 1, message = "Invalid Age: Equals to zero or Less than zero")
	 //@Max(value = 100, message = "Invalid Age: Exceeds 100 years")
	private String croptoapply;
	
	private String targetpests;
	
	private String dose;
	
	private String productdescription;

	public PestandFertilizer() {
	}
	
	
	//id name cost packagingsize companyname croptoapply targetpests dose productdescription
	
	public PestandFertilizer(String name, String cost, String packagingsize, String companyname, String croptoapply, String targetpests, String dose, String productdescription ) {
		this.name = name;
		this.cost = cost;
		this.packagingsize=packagingsize;
		this.companyname=companyname;
		this.croptoapply=croptoapply;
		this.targetpests=targetpests;
		this.dose=dose;
		this.productdescription=productdescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	//id name cost packagingsize companyname croptoapply targetpests dose productdescription
	
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackagingSize() {
		return packagingsize;
	}

	public void setpackagingsize(String packagingsize) {
		this.packagingsize = packagingsize;
	}
	
	public String getCompanyName() {
		return companyname;
	}

	public void setCompanyName(String companyname) {
		this.companyname = companyname;
	}
	
	public String getCroptoApply() {
		return croptoapply;
	}

	public void setCroptoApply(String croptoapply) {
		this.croptoapply = croptoapply;
	}
	
	public String getTargetPests() {
		return targetpests;
	}

	public void setTargetPests(String targetpests) {
		this.targetpests = targetpests;
	}
	
	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}
	
	public String getProductDescription() {
		return productdescription;
	}

	public void setProductDescription(String productdescription) {
		this.productdescription = productdescription;
	}
	
}
