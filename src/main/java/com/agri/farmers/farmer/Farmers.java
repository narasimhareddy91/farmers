package com.agri.farmers.farmer;
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
@Table(name = "farmers")
public class Farmers {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	
	@Column(nullable = false, length = 128)
	@NotNull @Length(min = 5, max = 128)
	private String name;
	
	private Integer landinAcres;
	
	@Column(length = 128)
	private String address;
	
	@Column(nullable = false, length = 128)
	@NotNull @Length(min = 10, max = 12)
	@NotBlank(message = "Invalid Phone number: Empty number")
    @NotNull(message = "Invalid Phone number: Number is NULL")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
	private String mobile;
	
	// @Min(value = 1, message = "Invalid Age: Equals to zero or Less than zero")
	 //@Max(value = 100, message = "Invalid Age: Exceeds 100 years")
	private Integer age;
	
	private String defaultcrops;

	public Farmers() {
	}
	
	public Farmers(String name, Integer landinAcres,  Integer age , String address, String mobile, String defaultcrops) {
		this.name = name;
		this.landinAcres = landinAcres;
		this.address=address;
		this.mobile=mobile;
		this.defaultcrops=defaultcrops;
		this.age=age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLandinAcres() {
		return landinAcres;
	}

	public void setLandinAcres(Integer landinAcres) {
		this.landinAcres = landinAcres;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getDefaultcrops() {
		return defaultcrops;
	}

	public void setDefaultcrops(String defaultcrops) {
		this.defaultcrops = defaultcrops;
	}
}
