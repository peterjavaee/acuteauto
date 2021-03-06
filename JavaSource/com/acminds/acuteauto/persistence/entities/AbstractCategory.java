package com.acminds.acuteauto.persistence.entities;

// Generated May 4, 2012 3:55:01 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * Category generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractCategory extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer categoryId;
	private Category category;
	private UserInfo userInfo;
	private String name;
	private String description;
	private String miscData;
	private Integer categoryType;
	private Integer seqOrder;
	private boolean authRequired;
	private Date effectiveDate;
	private Date expiryDate;
	private Date createDate;
	private List<Vehicle> vehicles = new ArrayList<Vehicle>(0);
	private List<Category> categories = new ArrayList<Category>(0);

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CATEGORY_ID", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_ID")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CREATED_BY", nullable = false)
	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
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
	
	@Column(name = "MISC_DATA", length = 250)
	public String getMiscData() {
		return this.miscData;
	}

	public void setMiscData(String miscData) {
		this.miscData = miscData;
	}

	@Column(name = "CATEGORY_TYPE")
	public Integer getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
	}
	
	@Column(name = "SEQ_ORDER")
	public Integer getSeqOrder() {
		return this.seqOrder;
	}

	public void setSeqOrder(Integer seqOrder) {
		this.seqOrder = seqOrder;
	}

	@Column(name = "AUTH_REQUIRED", nullable = false)
	public boolean isAuthRequired() {
		return this.authRequired;
	}

	public void setAuthRequired(boolean authRequired) {
		this.authRequired = authRequired;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE", nullable = false, length = 10)
	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EXPIRY_DATE", length = 10)
	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", insertable=false, nullable=false, updatable=false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
