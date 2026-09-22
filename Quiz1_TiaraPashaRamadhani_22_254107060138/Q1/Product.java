package Q1;


public class Product {
    private int productId;
    private float productPrice;
    private String productType;

    public Product(float productPrice, String productType) {
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }


    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

     public void addProduct() {
        System.out.println("Product " + productType + " added successfully.");
    }

    public void modifyProduct() {
        System.out.println("Product" + productType + " modified successfully.");
    }

    public void selectProduct(int productId) {
        System.out.println("Product " + productId + " selected successfully.");

    }


}
