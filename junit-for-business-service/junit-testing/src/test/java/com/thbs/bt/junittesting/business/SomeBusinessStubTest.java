package com.thbs.bt.junittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.thbs.bt.junittesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {

		return new int[] { 1, 2, 3 };
	}
}
	class SomeDataServiceEmptyStub implements SomeDataService {

		@Override
		public int[] retrieveAllData() {

			return new int[] {};
		}

	}

	class SomeDataServiceOneElementStub implements SomeDataService{

		@Override
		public int[] retrieveAllData() {
			
			return new int[]{5};
		}
	}
class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceEmptyStub());
		int actualResult = business.calculateSumUsingDataService();//new int[] {}
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}



@Test
public void calculateSumUsingDataService_oneValue() {
	SomeBusinessImpl business = new SomeBusinessImpl();
	business.setSomeDataService(new SomeDataServiceOneElementStub());
	int actualResult = business.calculateSumUsingDataService();//new int[] { 5 }
	int expectedResult = 5;
	assertEquals(expectedResult, actualResult);
}

}