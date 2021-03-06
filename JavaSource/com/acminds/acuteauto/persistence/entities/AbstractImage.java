package com.acminds.acuteauto.persistence.entities;

// Generated Mar 3, 2012 9:48:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * Image generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractImage extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer imageId;
	private Vehicle vehicle;
	private UserInfo userInfo;
	private Client client;
	private String name;
	private String description;
	private String imageExtension;
	private String mimeType;
	private String imageLocation;
	private Integer imageType;
	private Integer imageSize;
	private Boolean banner;
	private Date createDate;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "IMAGE_ID", unique = true, nullable = false)
	public Integer getImageId() {
		return this.imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VEHICLE_ID")
	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_INFO_ID")
	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENT_ID")
	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Column(name = "NAME", nullable = false, length = 60)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "IMAGE_EXTENSION", length = 10)
	public String getImageExtension() {
		return this.imageExtension;
	}

	public void setImageExtension(String imageExtension) {
		this.imageExtension = imageExtension;
	}

	@Column(name = "MIME_TYPE", length = 40)
	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@Column(name = "IMAGE_LOCATION", length = 100)
	public String getImageLocation() {
		return this.imageLocation;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}

	@Column(name = "IMAGE_TYPE")
	public Integer getImageType() {
		return this.imageType;
	}

	public void setImageType(Integer imageType) {
		this.imageType = imageType;
	}
	
	@Column(name = "IMAGE_SIZE")
	public Integer getImageSize() {
		return this.imageSize;
	}

	public void setImageSize(Integer imageSize) {
		this.imageSize = imageSize;
	}

	@Column(name = "BANNER")
	public Boolean getBanner() {
		return this.banner;
	}

	public void setBanner(Boolean banner) {
		this.banner = banner;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
