package com.example.loginregistro.interfaces;


import com.example.loginregistro.models.AutenticacionLoginModel;
import com.example.loginregistro.models.AutenticacionResModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface autenticacionAPI {
    @POST("auth/login")
    Call<AutenticacionResModel> postLogin(@Body AutenticacionLoginModel credenciales);
}
