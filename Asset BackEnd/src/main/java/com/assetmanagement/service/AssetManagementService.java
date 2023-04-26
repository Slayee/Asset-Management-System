package com.assetmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagement.model.Asset;
import com.assetmanagement.model.AssetStatus;
import com.assetmanagement.repository.IAssetManagementRepo;

//@Service
public class AssetManagementService implements IAssetManagementService {


	
	List<Asset> assets;
	AssetManagementService() {	
		assets = new ArrayList<>();
		assets.add(new Asset(100,"Godly", 25, "procured"));
		assets.add(new Asset(101,"Awesome", 23, "searching"));
		assets.add(new Asset(102,"Maddening", 50, "assigned"));
		assets.add(new Asset(103,"Serpented", 60, "degraded"));
		assets.add(new Asset(104,"Demonic", 100, "maintenance"));

	}
	
	
//	Working
	public List<Asset> getAllAssets() {
		System.out.println("Inside get all assets service.");
		return assets;
//		return repo.findAll();
	}
	
	
// 	Working
	public AssetStatus addAsset(Asset asset) {
		System.out.println("Inside get add assets service.");
		String message = "";
		boolean present = false;
		AssetStatus status = new AssetStatus(0, "Asset is not added", null);			
		for(Asset a : assets) {
			if(a.getAssetId()==asset.getAssetId()) {
				status.setStatusMessage("Asset with this id is present");
				present = true;
			}
		}
		if(!present) {
			assets.add(asset);
			status.setStatusCode(1);
			status.setStatusMessage("Asset is added");
			status.setAsset(asset);
		}
		return status;
	}

//	Working
	public AssetStatus updateAsset(Asset asset) {
		// TODO Auto-generated method stub
		System.out.println("Inside get update assets service.");
		AssetStatus status = new AssetStatus("Asset not updated ");
		for (Asset a : assets) {
			if(a.getAssetId()==asset.getAssetId()) {
				a.setAssetName(asset.getAssetName());
				a.setQty(asset.getQty());
				a.setStatus(asset.getStatus());
				status.setStatusCode(1);
				status.setStatusMessage("Asset Updated");
				status.setAsset(a);
			}
		}
		
		
		return status;
	}

//	Working
	public AssetStatus deleteAsset(int id) {
		System.out.println("Inside get delete assets service.");
		AssetStatus status = new AssetStatus("Asset not found");
		Asset deleteAsset = null;
		for (Asset asset : assets) {
			if(asset.getAssetId()==id) {
				status.setStatusCode(1);
				status.setStatusMessage("Asset Deleted");
				deleteAsset = asset;
			}
		}
		assets.remove(deleteAsset);
		return status;
	}

	

}
