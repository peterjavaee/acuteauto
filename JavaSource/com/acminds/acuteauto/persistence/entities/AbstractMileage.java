package com.acminds.acuteauto.persistence.entities;

// Generated May 13, 2012 8:21:43 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * Mileage generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractMileage extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer mileageId;
	private Style style;
	private Integer mileageCity;
	private Integer mileageHwy;
	private Integer year;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MILEAGE_ID", unique = true, nullable = false)
	public Integer getMileageId() {
		return this.mileageId;
	}

	public void setMileageId(Integer mileageId) {
		this.mileageId = mileageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STYLE_ID", nullable = false)
	public Style getStyle() {
		return this.style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	@Column(name = "MILEAGE_CITY")
	public Integer getMileageCity() {
		return this.mileageCity;
	}

	public void setMileageCity(Integer mileageCity) {
		this.mileageCity = mileageCity;
	}

	@Column(name = "MILEAGE_HWY")
	public Integer getMileageHwy() {
		return this.mileageHwy;
	}

	public void setMileageHwy(Integer mileageHwy) {
		this.mileageHwy = mileageHwy;
	}

	@Column(name = "YEAR")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
