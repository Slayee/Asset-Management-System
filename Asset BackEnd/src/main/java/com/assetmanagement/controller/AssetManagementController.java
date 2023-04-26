package com.assetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assetmanagement.model.Asset;
import com.assetmanagement.model.AssetStatus;
import com.assetmanagement.service.IAssetManagementService;
@RestController
@CrossOrigin(origins ="http://localhost:3000/")
@RequestMapping("/asset")
public class AssetManagementController {

	public AssetManagementController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	IAssetManagementService service;
	
	@GetMapping("/all")
	public List<Asset> getAllAssets() {
		System.out.println("inside all controller");
		return service.getAllAssets();
	}
	
	@PostMapping("/add")
	public AssetStatus addAsset(@RequestBody Asset asset) {
		System.out.println("inside add controller");
		return service.addAsset(asset);
	}
	
	@PutMapping("/update")
	public AssetStatus updateAsset(@RequestBody Asset asset) {
		System.out.println("inside update controller");
		return service.updateAsset(asset);
	}
	
	@DeleteMapping("/delete")
	public AssetStatus deleteAsset(@RequestParam int id) {
		System.out.println("inside delete controller");
		return service.deleteAsset(id);
	}
	

}
