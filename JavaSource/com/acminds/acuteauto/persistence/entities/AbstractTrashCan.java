package com.acminds.acuteauto.persistence.entities;

// Generated Jun 28, 2012 7:39:42 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.acminds.acuteauto.persistence.dto.*;

/**
 * TrashCan generated by customhbm2java
 */
@MappedSuperclass
public abstract class AbstractTrashCan extends
		com.acminds.acuteauto.persistence.BaseDTO implements
		java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer trashCanId;
	private String location;
	private UserInfo trashedBy;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TRASH_CAN_ID", unique = true, nullable = false)
	public Integer getTrashCanId() {
		return this.trashCanId;
	}

	public void setTrashCanId(Integer trashCanId) {
		this.trashCanId = trashCanId;
	}

	@Column(name = "LOCATION", nullable = false, length = 100)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRASHED_BY", nullable = false)
	public UserInfo getTrashedBy() {
		return this.trashedBy;
	}

	public void setTrashedBy(UserInfo trashedBy) {
		this.trashedBy = trashedBy;
	}
}
