package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.ParameterizedTest;

class ValidatePhoneNumberTest {
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"0123456789,true",
		"01234,false",
		"abc123, false",
		"1234567890,false"
	})
	//c2: don't use @test
	void test(String phone, boolean expected) {	
		//when
		boolean isValid = placeOrderController.validatePhoneNumber(phone);
		//then
		assertEquals(expected, isValid);
	}
	/*@Test
	void test() {	
		//when
		boolean isValid = placeOrderController.validatePhoneNumber("0123456789");
		//then
		assertEquals(true, isValid);
	}*/


}
