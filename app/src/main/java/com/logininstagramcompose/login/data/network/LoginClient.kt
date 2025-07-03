package com.logininstagramcompose.login.data.network

import com.logininstagramcompose.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {

    @GET("/v3/e539293a-1200-450d-8abb-4f72d6719231")
    suspend fun doLogin():Response<LoginResponse>
}