package com.example.stockstockyprototype;

public class WineStockModel {
    private int id;
    private int itemCode;
    private String itemName;
    private int par;
    private int srFridge;
    private int srRack;
    private int lgRack;
    private int lgFridge;
    private int lgRetail;
    private int fstFridge;
    private int fstRack;
    private int fstShelf;
    private int fstRail;
    private int cellar;


    public WineStockModel(int id, int itemCode, String itemName, int par, int srFridge, int lgRack, int lgFridge, int lgRetail, int fstFridge, int fstRack, int fstShelf, int fstRail, int cellar) {
        this.id = id;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.par = par;
        this.srFridge = srFridge;
        this.lgRack = lgRack;
        this.lgFridge = lgFridge;
        this.lgRetail = lgRetail;
        this.fstFridge = fstFridge;
        this.fstRack = fstRack;
        this.fstShelf = fstShelf;
        this.fstRail = fstRail;
        this.cellar = cellar;
    }

    @Override
    public String toString() {
        return "WineStockModel{" +
                "id=" + id +
                ", itemCode=" + itemCode +
                ", itemName='" + itemName +
                ", par=" + par +
                ", srFridge=" + srFridge +
                ", lgRack=" + lgRack +
                ", lgFridge=" + lgFridge +
                ", lgRetail=" + lgRetail +
                ", fstFridge=" + fstFridge +
                ", fstRack=" + fstRack +
                ", fstShelf=" + fstShelf +
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

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public int getLgFridge() {
        return lgFridge;
    }

    public void setLgFridge(int lgFridge) {
        this.lgFridge = lgFridge;
    }

    public int getLgRetail() {
        return lgRetail;
    }

    public void setLgRetail(int lgRetail) {
        this.lgRetail = lgRetail;
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
