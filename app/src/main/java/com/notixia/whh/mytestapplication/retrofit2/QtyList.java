package com.notixia.whh.mytestapplication.retrofit2;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QtyList {

    @SerializedName("quantityMap")
    private ArrayList<MyPojo> qtyList;

    public ArrayList<MyPojo> getQtyArrayList() {
        return qtyList;
    }

    public void setQtyListArrayList(ArrayList<MyPojo> qtyArrayList) {
        this.qtyList = qtyArrayList;
    }
}