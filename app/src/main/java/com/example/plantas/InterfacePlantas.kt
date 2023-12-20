package com.example.plantas

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface InterfacePlantas {
    @GET("plants?token=")
    fun getData(
        @Header("Authorization") token: String,
        @Query("token") query: String
    ): Call<List<UsersItem>>
}