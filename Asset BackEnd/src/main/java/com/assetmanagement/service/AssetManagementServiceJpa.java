package com.assetmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assetmanagement.model.Asset;
import com.assetmanagement.model.AssetStatus;
import com.assetmanagement.repository.IAssetManagementRepo;
@Service
public class AssetManagementServiceJpa implements IAssetManagementService {
	@Autowired
	IAssetManagementRepo repo;

	public List<Asset> getAllAssets() {
		System.out.println("Inside get all assets service.");
		return repo.findAll();
	}

	
	public AssetStatus addAsset(Asset asset) {
		System.out.println("Inside add asset service.");
		AssetStatus status = new AssetStatus("Asset with this id is present");
		if(!repo.existsById(asset.getAssetId())) {
			repo.save(asset);
			status.setStatusMessage("Asset is added");
			status.setAsset(asset);
			status.setStatusCode(1);
		}
		return status;
	}

	
	public AssetStatus updateAsset(Asset asset) {
		System.out.println("Inside update asset service.");
		AssetStatus status = new AssetStatus("Asset not found");
		if(repo.existsById(asset.getAssetId())) {
			repo.save(asset);
			status.setStatusCode(1);
			status.setStatusMessage("Asset Deleted");
			status.setAsset(asset);
		}
		return status;
	}

	
	public AssetStatus deleteAsset(int id) {
		System.out.println("Inside delete asset service.");
		AssetStatus status = new AssetStatus("Asset not found");
		if(repo.existsById(id)) {
			repo.deleteById(id);
			status.setStatusCode(1);
			status.setStatusMessage("Asset Deleted");
		}
		return status;
	}

}
