package com.assetmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assetmanagement.model.Asset;
@Repository
public interface IAssetManagementRepo extends JpaRepository<Asset, Integer> {

}
