package com.assetmanagement.model;

public class AssetStatus {
	private int statusCode;
	private String statusMessage;
	private Asset asset;
	
	public AssetStatus(int statusCode, String statusMessage, Asset asset) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.asset = asset;
	}
	public AssetStatus(String statusMessage) {
		super();
		this.statusMessage = statusMessage;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	@Override
	public String toString() {
		return "AssetStatus [statusCode=" + statusCode + ", statusMessage=" + statusMessage + ", asset=" + asset + "]";
	}

	public AssetStatus() {
		super();
	}

	
	
}
