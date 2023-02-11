package org.com.normal.tasks.entity;

import java.util.Objects;

public class WeightItem {

    private String weightItemName;
    private String weightItemDescription;

    public WeightItem() {
    }

    public WeightItem(String weightItemName, String weightItemDescription) {
        this.weightItemName = weightItemName;
        this.weightItemDescription = weightItemDescription;
    }

    public String getWeightItemName() {
        return weightItemName;
    }

    public void setWeightItemName(String weightItemName) {
        this.weightItemName = weightItemName;
    }

    public String getWeightItemDescription() {
        return weightItemDescription;
    }

    public void setWeightItemDescription(String weightItemDescription) {
        this.weightItemDescription = weightItemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeightItem that = (WeightItem) o;
        return Objects.equals(weightItemName, that.weightItemName) && Objects.equals(weightItemDescription, that.weightItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weightItemName, weightItemDescription);
    }
}
