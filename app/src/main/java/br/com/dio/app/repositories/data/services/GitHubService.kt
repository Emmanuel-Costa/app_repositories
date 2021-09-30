package br.com.dio.app.repositories.data.services

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("user/{user}/repos")
    suspend fun listRepositories(@Path("user") user:String): List<Repo>
}