package com.programmingsharing.demo.entities.audit;

import java.sql.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public class AuditableEntity {
	
	@CreatedBy
	@Column(name = "createdBy")
	private String createdBy;
	
	@CreatedDate
	@Column(name = "createdDate")
	private Date createdDate;
	
	@LastModifiedBy
	@Column(name = "lastModifiedBy")
	private String lastModifiedBy;
	
	
	@LastModifiedDate
	@Column(name = "lastModifiedDate")
	private Date lastModifiedDate;

	protected String getCreatedBy() {
		return createdBy;
	}

	protected void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	protected Date getCreatedDate() {
		return createdDate;
	}

	protected void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	protected String getLastModifiedBy() {
		return lastModifiedBy;
	}

	protected void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	protected Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	protected void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
