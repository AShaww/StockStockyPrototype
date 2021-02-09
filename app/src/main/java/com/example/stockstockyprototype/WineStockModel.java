package com.example.stockstockyprototype;

public class WineStockModel {
    private int id;
    private String itemName;
    private int itemCode;
    private int par;
    private int srFridge;
    private int lgRack;
    private int gFridge;
    private int gRetail;
    private int fstFridge;
    private int fstRack;
    private int fstShelf;
    private int fstCake;
    private int fstRail;
    private int cellar;

    public WineStockModel(int id, String itemName, int itemCode, int par, int srFridge, int lgRack, int gFridge, int gRetail, int fstFridge, int fstRack, int fstShelf, int fstCake, int fstRail, int cellar) {
        this.id = id;
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.par = par;
        this.srFridge = srFridge;
        this.lgRack = lgRack;
        this.gFridge = gFridge;
        this.gRetail = gRetail;
        this.fstFridge = fstFridge;
        this.fstRack = fstRack;
        this.fstShelf = fstShelf;
        this.fstCake = fstCake;
        this.fstRail = fstRail;
        this.cellar = cellar;
    }

    @Override
    public String toString() {
        return "WineStockModel{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemCode=" + itemCode +
                ", par=" + par +
                ", srFridge=" + srFridge +
                ", lgRack=" + lgRack +
                ", gFridge=" + gFridge +
                ", gRetail=" + gRetail +
                ", fstFridge=" + fstFridge +
                ", fstRack=" + fstRack +
                ", fstShelf=" + fstShelf +
                ", fstCake=" + fstCake +
                ", fstRail=" + fstRail +
                ", cellar=" + cellar +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public int getSrFridge() {
        return srFridge;
    }

    public void setSrFridge(int srFridge) {
        this.srFridge = srFridge;
    }

    public int getLgRack() {
        return lgRack;
    }

    public void setLgRack(int lgRack) {
        this.lgRack = lgRack;
    }

    public int getgFridge() {
        return gFridge;
    }

    public void setgFridge(int gFridge) {
        this.gFridge = gFridge;
    }

    public int getgRetail() {
        return gRetail;
    }

    public void setgRetail(int gRetail) {
        this.gRetail = gRetail;
    }

    public int getFstFridge() {
        return fstFridge;
    }

    public void setFstFridge(int fstFridge) {
        this.fstFridge = fstFridge;
    }

    public int getFstRack() {
        return fstRack;
    }

    public void setFstRack(int fstRack) {
        this.fstRack = fstRack;
    }

    public int getFstShelf() {
        return fstShelf;
    }

    public void setFstShelf(int fstShelf) {
        this.fstShelf = fstShelf;
    }

    public int getFstCake() {
        return fstCake;
    }

    public void setFstCake(int fstCake) {
        this.fstCake = fstCake;
    }

    public int getFstRail() {
        return fstRail;
    }

    public void setFstRail(int fstRail) {
        this.fstRail = fstRail;
    }

    public int getCellar() {
        return cellar;
    }

    public void setCellar(int cellar) {
        this.cellar = cellar;
    }
}
