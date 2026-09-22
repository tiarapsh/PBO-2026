package Q1;


public class Stock {
    private String stockId;
    private int quantity;
    private int shopNo;

    public Stock(int quantity, int shopNo) {
        this.quantity = quantity;
        this.shopNo = shopNo;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public void setShopNo(int shopNo) {
        this.shopNo = shopNo;
    }

    public void addStock(){
        System.out.println("Stock No. " + shopNo + " many as " + quantity + " added successfully.");
    }

    public void modifyStock(int productId){
        System.out.println("Stock for " + productId + " modified successfully.");
    }

    public void selectStockItem(int productId){
        System.out.println("Stock " + productId + " selected successfully.");
    }
}


