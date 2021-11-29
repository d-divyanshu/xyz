package com.tour.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.tour.exception.InvalidTourPackageException;
import com.tour.model.TourPackage;

public class ServiceProvider {
	
	
	public boolean validatePackageType(String packageType) throws InvalidTourPackageException {
		if(packageType.equalsIgnoreCase("Escorted") || packageType.equalsIgnoreCase("Independent")){
			return true;
		}
		else
			throw new InvalidTourPackageException("Package Type is invalid");
	}
	
	
	public TourPackage viewTourPackage(List<TourPackage> packageList,String packageId) throws InvalidTourPackageException {
		if(packageList.size()==0){
			throw new InvalidTourPackageException("List is Empty");
		}
		else{
			for(TourPackage p : packageList){
				if(p.getPackageId().equals(packageId)){
					return p;
				}
			}
			throw new InvalidTourPackageException("Package ID is invalid");
		}
	}
	
	public List<TourPackage> viewTourPackagesByPackageType(List<TourPackage> packageList ,String packageType) throws InvalidTourPackageException{
		if(packageList.size()==0){
			throw new InvalidTourPackageException("List is Empty");
		}
		else
		{
			List<TourPackage>  result = new ArrayList<TourPackage>();
			for(TourPackage p : packageList){
				if(p.getPackageType().equalsIgnoreCase(packageType)){
					result.add(p);
				}
			}
			return result;
		}		
	}
	
	public Map<String,List<TourPackage>> viewTourPackagesTypeWise(List<TourPackage> packageList) throws InvalidTourPackageException {
		if(packageList.size()==0){
			throw new InvalidTourPackageException("List is Empty");
		}
		else
		{
			Map<String,List<TourPackage>>  result = new LinkedHashMap<String,List<TourPackage>>();
			for(TourPackage p : packageList){
				String packType=p.getPackageType();
				if(!result.containsKey(packType)){
					result.put(packType,new ArrayList<>());
				}
				List<TourPackage>  temp=result.get(packType);
				temp.add(p);
				result.put(packType,temp);
			}
			return result;
		}
	}
	
	public  Map<String,Integer> countTotalTourPackagesForEachPackageType(List<TourPackage> packageList, double packageCost) throws InvalidTourPackageException {
		if(packageList.size()==0){
			throw new InvalidTourPackageException("List is Empty");
		}
		else
		{
			Map<String,Integer>  result = new LinkedHashMap<String,Integer>();
			for(TourPackage p : packageList){
				String packType=p.getPackageType();
				if(p.getPerPersonCost()<=packageCost){
					if(!result.containsKey(packType)){
						result.put(packType,1);
					}
					else {
						result.put(packType,result.get(packType)+1);
					}					
				}				
			}
			return result;
		}
	}	
}


