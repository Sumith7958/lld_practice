package org.example.LLD.Solid.singleResponsibilityPrincipal;

public class Invoice {
    private Pen pen;
    private Market market;
    private int quantity;

    public Invoice(Pen pen, Market market, int quantity) {
        this.pen = pen;
        this.market = market;
        this.quantity = quantity;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int billingCost(Pen pen, int quantity) {
        return (pen.getPrice() * quantity);
    }

//    public void printInvoice() {
//    }
//
//    public void saveToDb() {
//    }
    //here single class is performing 3 operations caluclating billing, print,save this should not happen insted make different classes for each

}
