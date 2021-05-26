package com.dogukan;

public class BoardCell {
    private String stoneName;
    private String stoneColor;
    private String stoneCode;
    private int stonePoint;

    public BoardCell(String stoneName, String stoneColor,String stoneCode,int stonePoint) {
        this.stoneName = stoneName;
        this.stoneColor = stoneColor;
        this.stoneCode = stoneCode;
        this.stonePoint = stonePoint;
    }

    public String getStoneCode() {
        return stoneCode;
    }

    public void setStoneCode(String stoneCode) {
        this.stoneCode = stoneCode;
    }

    public int getStonePoint() {
        return stonePoint;
    }

    public void setStonePoint(int stonePoint) {
        this.stonePoint = stonePoint;
    }


    public String getStoneName() {
        return stoneName;
    }

    public void setStoneName(String stoneName) {
        this.stoneName = stoneName;
    }


    public String getStoneColor() {
        return stoneColor;
    }

    public void setStoneColor(String stoneColor) {
        this.stoneColor = stoneColor;
    }
}
