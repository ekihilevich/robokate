package json;

public class DataSource {
    private String product;
    private int productId;
    private String region;
    private String txType;
    private String effectiveDate;
    private int quantity;
    private float delta;
    private float total;
    private String billingMethod;
    private String paymentId;
    private float price;
    private float chargedAmount;
    private float taxAmount;

    public String getProduct() {
        return product;
    }

    public int getProductId() {
        return productId;
    }

    public String getRegion() {
        return region;
    }

    public String getTxType() {
        return txType;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getDelta() {
        return delta;
    }

    public float getTotal() {
        return total;
    }

    public String getBillingMethod() {
        return billingMethod;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public float getPrice() {
        return price;
    }

    public float getChargedAmount() {
        return chargedAmount;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDelta(float delta) {
        this.delta = delta;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setChargedAmount(float chargedAmount) {
        this.chargedAmount = chargedAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public String toString() {
        return String.format("product:%s,productId:%s,region:%s,txType:%s,effectiveDate:%s,quantity:%s,delta:%s,total:%s,billingMethod:%s,paymentId:%s,price:%s,chargedAmount:%s,taxAmount:%s",
                product, productId, region, txType, effectiveDate, quantity, delta, total, billingMethod, paymentId, price, chargedAmount, taxAmount);
    }

}