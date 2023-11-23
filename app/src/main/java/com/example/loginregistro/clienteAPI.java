package com.example.loginregistro;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class clienteAPI {
    private static String HOST = "https://sgeventos2617684.onrender.com/";
    public static Retrofit getClient(){
        Retrofit retroﬁt = new Retrofit.Builder().baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retroﬁt;
    }
}
