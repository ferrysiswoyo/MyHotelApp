package com.ferry.myhotelapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Student6 on 12/02/2016.
 */
public class WeatherMain {
    @SerializedName("temp")
    @Expose
    public double temp;
    @SerializedName("pressure")
    @Expose
    public int pressure;
    @SerializedName("humidity")
    @Expose
    public int humidity;
    @SerializedName("temp_main")
    @Expose
    public double temp_main;
    @SerializedName("temp_max")
    @Expose
    public double temp_max;
}
