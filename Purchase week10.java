
package week10;

public class Purchase {
    private String product;
    private int amount; 
    private int unitPrice;
    
    public Purchase(String p, a , unitP){
        this.product = p;
        this.amount = a;
        this.unitPrice = unitP;
    }
    
    public int price(){
        return this.amount * this.unitPrice;
    }
    
    public void increaseAmount(){
        this.amount++; 
    }
    
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
    
    
}
