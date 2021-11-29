package com.tour.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.tour.skeleton.SkeletonValidator;

public class Main {

	public static void main(String[] args) {

		SkeletonValidator validator = new SkeletonValidator();

		Result result = JUnitCore.runClasses(ServiceProviderTest.class);
		if (result.getFailureCount() == 0) {
			System.out.println("All Test cases Cleared");
		} else {
			System.out.println("One or more test case(s) failed");
			System.out.println("===============================");
			result.getFailures().forEach(x -> System.out.println(x.getMessage()));
		}
		
	}

}
