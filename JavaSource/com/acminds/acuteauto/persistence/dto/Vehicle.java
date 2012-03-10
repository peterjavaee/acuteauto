package com.acminds.acuteauto.persistence.dto;

// Generated Feb 29, 2012 11:25:37 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Vehicle generated by customhbm2java
 */
import javax.faces.bean.ManagedBean;

import com.acminds.acuteauto.persistence.entities.AbstractVehicle;
import com.acminds.acuteauto.utils.EnumConstants.ImageType;

@ManagedBean(name = "vehicle")
@Entity
@Table(name = "VEHICLE", catalog = "carobar")
public class Vehicle extends AbstractVehicle {
	private static final long serialVersionUID = 1L;
	@Transient
	public Image getBannerImage() {
		for(Image im: getImages()) {
			if(im.getBanner()!=null && im.getBanner())
				return im;
		}
		return null;
	}
	@Transient
	public Image getDisplayImage() {
		for(Image im: getImages()) {
			if(im.getImageType() == ImageType.PRIMARY)
				return im;
		}
		return null;
	}
}
