package com.notixia.whh.mytestapplication.retrofit2;

import com.squareup.moshi.Json;

public class QuantityMapPOJO {

    @Json(name = "quantityMap")
    private QuantityMap quantityMap;

    public QuantityMap getQuantityMap() {
        return quantityMap;
    }

    public void setQuantityMap(QuantityMap quantityMap) {
        this.quantityMap = quantityMap;
    }

}