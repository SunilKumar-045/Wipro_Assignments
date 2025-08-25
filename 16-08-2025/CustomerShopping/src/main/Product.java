package main;

import java.sql.Date;

public class Product {
    private int productId;
    private String productCode;
    private String productDesc;
    private double productPrice;
    private int productQty;
    private Date productExpDate;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public void setProductExpDate(Date productExpDate) {
        this.productExpDate = productExpDate;
    }

    // Constructor
    public Product(int productId, String productCode, String productDesc,
                   double productPrice, int productQty, Date productExpDate) {
        this.productId = productId;
        this.productCode = productCode;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.productQty = productQty;
        this.productExpDate = productExpDate;
    }

    // Getters & Setters
    public int getProductId() { return productId; }
    public String getProductCode() { return productCode; }
    public String getProductDesc() { return productDesc; }
    public double getProductPrice() { return productPrice; }
    public int getProductQty() { return productQty; }
    public Date getProductExpDate() { return productExpDate; }
}
