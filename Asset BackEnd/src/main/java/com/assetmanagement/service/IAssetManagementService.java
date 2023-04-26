package com.assetmanagement.service;
import java.util.List;

import com.assetmanagement.model.Asset;
import com.assetmanagement.model.AssetStatus;

public interface IAssetManagementService {

	public List<Asset> getAllAssets();
	AssetStatus addAsset(Asset asset);
	AssetStatus updateAsset(Asset asset);
	AssetStatus deleteAsset(int id);
}
