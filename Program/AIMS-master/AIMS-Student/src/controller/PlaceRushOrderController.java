package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import entity.media.Media;
import entity.cart.Cart;
import entity.cart.CartMedia;
import entity.rushOrder.*;

public class PlaceRushOrderController extends BaseController{
	
	public void processRushOrderInfo() {
		
	}
	
	public void validateRushOrderInfo(HashMap<String, String> info)throws InterruptedException, IOException {
		
	}
	
	public boolean validateMedia(String Media) {
		return true;
	}
	
	
	public boolean checkSupportAddress(String address) {
		if(address==null) return false;
		boolean check=false;
		String ad = address.toLowerCase();
		check = ad.contains("ha noi");
    	if(!(address.matches("[\sa-zA-Z0-9]+")&&check)) return false;
		return true;
	}
	
	public boolean validateRushOrderInfo(String info) {
		if(info==null) return false;
		return true;
	}
	public void changeFormulaShipFee() {
		
	}
	
	
}
