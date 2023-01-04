package entity.rushOrder;
import java.util.Calendar;
import java.util.HashMap;
import entity.media.*;
import common.exception.PlaceRushOrderException;
import entity.order.*;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entity.db.AIMSDB;

public class RushOrder extends Order {
	private String note;
	private String expectedTime;
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public RushOrder() {
    	super();
    	this.lstOrderMedia = new ArrayList<>();
    	this.expectedTime= LocalDateTime.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonthValue(),
    			LocalDateTime.now().getDayOfMonth(),LocalDateTime.now().getHour(),LocalDateTime.now().getMinute(),
    			LocalDateTime.now().getSecond()).format(formatter);
    }
    
    public RushOrder(List lstOrderMedia) {
    	super(lstOrderMedia);
    	this.lstOrderMedia=lstOrderMedia;
    }
    
	public RushOrder(List lstOrderMedia, String expectedTime, String note) {
		super(lstOrderMedia);
		this.expectedTime= expectedTime;
		this.note = note;
	}
	
	public boolean isRushed() {
		return true;
	}
	
	@Override
	public HashMap getDeliveryInfo() {
		return deliveryInfo;
	}
	
	public String getExpectedTime() {
		return expectedTime;
	}
	
	public void setExpectedTime(String expectedTime) {
		this.expectedTime = expectedTime;
	}
	
	 @Override
	    public void addOrderMedia(OrderMedia om) {
	        if (om.getMedia().isSupportRush()) {
	            addOrderMedia(om);
	        }
	    }

	    @Override
	    public void removeOrderMedia(OrderMedia om) {
	        if (om.getMedia().isSupportRush()) {
	            removeOrderMedia(om);
	        }
	    }

}
