package model;

public class Investment {

    private String ticker;
    private String type;
    private int quantity;
    private Double purchasePrice;

    public Investment(String ticker, String type, int quantity, Double purchasePrice){
        this.ticker = ticker;
        this.type = type;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
