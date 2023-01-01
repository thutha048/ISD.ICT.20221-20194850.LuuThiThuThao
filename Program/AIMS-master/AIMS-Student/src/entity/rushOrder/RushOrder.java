package entity.rushOrder;
import java.util.Calendar;
import java.util.HashMap;
import entity.media.*;
import common.exception.PlaceRushOrderException;
import entity.order.*;

public class RushOrder extends Order {
	private String note;
	private String expectedTime;
	
	public RushOrder(String expectedTime, String note) {
		super();
		this.expectedTime= expectedTime;
		this.note = note;
	}
	
	public boolean isRushed() {
		return true;
	}
	

}
