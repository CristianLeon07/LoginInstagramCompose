package com.logininstagramcompose.login.data

import com.logininstagramcompose.login.data.network.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user: String, password: String): Boolean{

        return api.doLogin(user,password)
    }
}