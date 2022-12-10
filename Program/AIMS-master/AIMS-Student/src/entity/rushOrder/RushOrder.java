package entity.rushOrder;

public class RushOrder {
	private String note;
	private String expectedTime;
	
	public RushOrder(String expectedTime, String note) {
		super();
		this.expectedTime= expectedTime;
		this.note = note;
	}
}
