package org.com.normal.tasks.entity;

import java.util.Objects;

public class PieceGoods {

    private String pieceGoodsName;
    private String pieceGoodsDescription;
    private int pieceGoodsWeight;

    public PieceGoods() {
    }

    public PieceGoods(String pieceGoodsName, String pieceGoodsDescription, int pieceGoodsWeight) {
        this.pieceGoodsName = pieceGoodsName;
        this.pieceGoodsDescription = pieceGoodsDescription;
        this.pieceGoodsWeight = pieceGoodsWeight;
    }

    public String getPieceGoodsName() {
        return pieceGoodsName;
    }

    public void setPieceGoodsName(String pieceGoodsName) {
        this.pieceGoodsName = pieceGoodsName;
    }

    public String getPieceGoodsDescription() {
        return pieceGoodsDescription;
    }

    public void setPieceGoodsDescription(String pieceGoodsDescription) {
        this.pieceGoodsDescription = pieceGoodsDescription;
    }

    public int getPieceGoodsWeight() {
        return pieceGoodsWeight;
    }

    public void setPieceGoodsWeight(int pieceGoodsWeight) {
        this.pieceGoodsWeight = pieceGoodsWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceGoods that = (PieceGoods) o;
        return pieceGoodsWeight == that.pieceGoodsWeight && Objects.equals(pieceGoodsName, that.pieceGoodsName) && Objects.equals(pieceGoodsDescription, that.pieceGoodsDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceGoodsName, pieceGoodsDescription, pieceGoodsWeight);
    }
}
