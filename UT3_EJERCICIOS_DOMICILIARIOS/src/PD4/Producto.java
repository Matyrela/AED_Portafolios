package PD4;

public class Producto {
    private int ProductCode;
    private String ProductDesc;
    private int ProductPrice;
    private int ProductCant;

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public String getProductDesc() {
        return ProductDesc;
    }

    public void setProductDesc(String productDesc) {
        ProductDesc = productDesc;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }

    public int getProductCant() {
        return ProductCant;
    }

    public void setProductCant(int productCant) {
        ProductCant = productCant;
    }

    public Producto(int productCode, String productDesc, int productPrice, int productCant) {
        ProductCode = productCode;
        ProductDesc = productDesc;
        ProductPrice = productPrice;
        ProductCant = productCant;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ProductDesc + ", ");
        sb.append(this.ProductPrice + ", ");
        sb.append(this.ProductCant);
        return sb.toString();
    }
}
