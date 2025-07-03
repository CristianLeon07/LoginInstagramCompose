package com.logininstagramcompose.login.domain

import com.logininstagramcompose.login.data.LoginRepository

class LoginUseCase {
    private val repository = LoginRepository()

    suspend operator fun invoke(user: String, password: String): Boolean {

        return repository.doLogin(user = user, password = password)

    }
}