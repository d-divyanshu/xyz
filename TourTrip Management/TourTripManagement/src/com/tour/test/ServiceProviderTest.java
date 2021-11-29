package com.tour.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import com.tour.model.TourPackage;
import com.tour.util.ServiceProvider;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ServiceProviderTest {
	
	private static List<TourPackage> packageList = new ArrayList<>();
	private static ServiceProvider serviceObj;
	
	
	@BeforeClass
	public static void setUp() throws Exception {
		serviceObj = new ServiceProvider();
		//Create few  objects for TourPackage class and add to packageList.
		//Use that list to test all the methods in ServiceProvider class that requires a list of TourPackage 
	}

	//Test the validatePackageType method when Independent
	public void test11ValidatePackageTypeWhenIndependent(){
		
		//fill code
		
	}
	
	//Test the validatePackageType method when Escorted
	public void test12ValidatePackageTypeWhenEscorted() {
		
		//fill code
		
	}	
	
	//Test the validatePackageType method when invalid
	public void test13ValidatePackageTypeWhenInvalid() {
		
		//fill code
		
	}
	
	//Test the viewTourPackage method for a valid packageId
	public void test14ViewTourPackageForValidPackageId() {
		
		//fill code
		
	}

	//Test the viewTourPackage method for an invalid packageId
	public void test15ViewTourPackageForInvalidPackageId() {
		
		//fill code
		
	}

	//Test the viewTourPackagesByPackageType method 
	public void test16ViewTourPackagesByPackageType() {
		
		//fill code
		
	}

	//Test the viewTourPackagesByPackageType method for an empty list
	public void test17ViewTourPackagesByPackageTypeForEmptyList() {
	
		//fill code
		
	}
	
	//Test the viewTourPackagesTypeWise method
	public void test18ViewTourPackagesTypeWise() {
	
		//fill code
		
	}
	
	//Test the viewTourPackagesTypeWise method for empty list
	public void test19ViewTourPackagesTypeWiseForEmptyList() {
		
		//fill code
		
	}
	
	//Test the countTotalTourPackagesForEachPackageType method
	public void test20CountTotalTourPackagesForEachPackageType() {
		
		//fill code
		
	}

	//Test the countTotalTourPackagesForEachPackageType method for empty list
	public void test21CountTotalTourPackagesForEachPackageTypeForEmptyList() {
		
		//fill code
		
	}	
}