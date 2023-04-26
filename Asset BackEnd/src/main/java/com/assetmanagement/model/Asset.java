package com.assetmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.Version;

@Entity
public class Asset {

	@Id
	int assetId;
	String assetName;
	int qty;
	String status;
	
	Date createTime;
	Date lastUpdateTime;
	
	public Asset(int assetId, String assetName, int qty, String status) {
		this.assetId = assetId;
		this.assetName = assetName;
		this.qty = qty;
		this.status = status;
	}
	public Asset(String assetName, int qty, String status) {
		this.assetName = assetName;
		this.qty = qty;
		this.status = status;
	}
	
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", assetName=" + assetName + ", qty=" + qty + ", status=" + status
				+ ", createTime=" + createTime + ", lastUpdateTime=" + lastUpdateTime + "]";
	}
	public Asset() {
		super();
	}
	
	
}
