package com.thbs.bt.junittesting.business;

import com.thbs.bt.junittesting.data.SomeDataService;

public class SomeBusinessImpl {
private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	
	
	public int calculateSumUsingDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		for(int value:data) {
			sum += value;
		}
		
		//someDataService.storeSum(sum);
		return sum;
		//Functional Style
		//return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}


}
