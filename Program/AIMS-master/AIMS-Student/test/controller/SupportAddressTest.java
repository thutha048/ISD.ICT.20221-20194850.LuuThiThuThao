package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SupportAddressTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	
	@ParameterizedTest
	@CsvSource({
		"ha noi,true",
		"so 15 Hai Ba Trung Ha Noi,true",
		", false",
		"$#Hanoi,false",
		"hai phong, false",
		"hanoi,false"
	})

	void test(String address, boolean expected) {	
		//when
		boolean isValid = placeRushOrderController.checkSupportAddress(address);
		//then
		assertEquals(expected, isValid);
	}

}
