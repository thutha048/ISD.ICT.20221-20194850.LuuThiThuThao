package entity.invoice;

import entity.order.Order;
import entity.rushOrder.*;

public class Invoice {

    private Order order;
    private int amount;
    private RushOrder rushOrder;
    
    public Invoice(){

    }

    public Invoice(Order order){
        this.order = order;
    }

    public Invoice(Order order, RushOrder rushOrder) {
    	this.order= order;
    	this.rushOrder= rushOrder;
    }
    public Order getOrder() {
        return order;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void saveInvoice(){
        
    }
}
