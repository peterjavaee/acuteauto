package com.acminds.acuteauto.persistence.entities;

// Generated Mar 3, 2012 9:48:22 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * Inquiry generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractInquiry extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer inquiryId;
	private UserInfo userInfo;
	private Vehicle vehicle;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private Integer inquiryType;
	private String notes;
	private Date createDate;
	private List<FindVehicle> findVehicles = new ArrayList<FindVehicle>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "INQUIRY_ID", unique = true, nullable = false)
	public Integer getInquiryId() {
		return this.inquiryId;
	}

	public void setInquiryId(Integer inquiryId) {
		this.inquiryId = inquiryId;
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
	@JoinColumn(name = "VEHICLE_ID")
	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Column(name = "FIRST_NAME", nullable = false, length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", nullable = false, length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "PHONE_NUMBER", nullable = false, length = 20)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "EMAIL", nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "INQUIRY_TYPE")
	public Integer getInquiryType() {
		return this.inquiryType;
	}

	public void setInquiryType(Integer inquiryType) {
		this.inquiryType = inquiryType;
	}

	@Column(name = "NOTES", length = 800)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false, insertable=false, updatable=false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inquiry")
	public List<FindVehicle> getFindVehicles() {
		return this.findVehicles;
	}

	public void setFindVehicles(List<FindVehicle> findVehicles) {
		this.findVehicles = findVehicles;
	}

}
