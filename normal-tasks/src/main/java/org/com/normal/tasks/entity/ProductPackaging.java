package org.com.normal.tasks.entity;

import java.util.Objects;

public class ProductPackaging {

    private String productPackagingName;
    private int productPackagingWeight;

    public ProductPackaging() {
    }

    public ProductPackaging(String productPackagingName, int productPackagingWeight) {
        this.productPackagingName = productPackagingName;
        this.productPackagingWeight = productPackagingWeight;
    }

    public String getProductPackagingName() {
        return productPackagingName;
    }

    public void setProductPackagingName(String productPackagingName) {
        this.productPackagingName = productPackagingName;
    }

    public int getProductPackagingWeight() {
        return productPackagingWeight;
    }

    public void setProductPackagingWeight(int productPackagingWeight) {
        this.productPackagingWeight = productPackagingWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackaging that = (ProductPackaging) o;
        return productPackagingWeight == that.productPackagingWeight && Objects.equals(productPackagingName, that.productPackagingName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productPackagingName, productPackagingWeight);
    }
}
