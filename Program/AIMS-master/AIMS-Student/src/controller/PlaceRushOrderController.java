package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Logger;

import common.exception.PlaceOrderException;

import java.util.Iterator;

import entity.order.*;
import entity.media.Media;
import entity.cart.Cart;
import entity.cart.CartMedia;
import entity.rushOrder.*;
import entity.invoice.Invoice;
import views.screen.popup.PopupScreen;

public class PlaceRushOrderController extends PlaceOrderController{
	
	private static PlaceRushOrderController PlaceRushOrderController;
	  private static Logger LOGGER = utils.Utils.getLogger(PlaceRushOrderController.class.getName());
	
	public Order createRushOrder() throws SQLException{
        Order order = new Order();
        RushOrder rushOrder = new RushOrder();
        for (Object object : Cart.getCart().getListMedia()) {
            CartMedia cartMedia = (CartMedia) object;
            OrderMedia orderMedia = new OrderMedia(cartMedia.getMedia(), 
                                                   cartMedia.getQuantity(), 
                                                   cartMedia.getPrice());
            if (cartMedia.getMedia().isSupportRush()) {
            	rushOrder.addOrderMedia(orderMedia);
            }
            else order.addOrderMedia(orderMedia);
        }
        return order;
    }
	
	 public Invoice createInvoice(Order order, RushOrder rushOrder) {
	       return new Invoice(order, rushOrder);
	 }
	    
	public void processRushOrderInfo(HashMap info) throws InterruptedException, IOException{
        LOGGER.info("Process Rush Delivery Info");
        LOGGER.info(info.toString());
        this.validateDeliveryInfo(info);
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
	public int changeFormulaShipFee(Order order, RushOrder rushOrder){
    	int total = this.calculateShippingFee(order);
        Random rand = new Random();
        int rushFees = (int)( ( (rand.nextFloat()*10)/100 ) * rushOrder.getAmount() );
        LOGGER.info("Rush Order Amount: " + rushOrder.getAmount() + " -- Shipping Fees: " + rushFees);
        total += rushFees;
        LOGGER.info("Total Shipping Fees: " + total);
        return total;
    }
	
}
