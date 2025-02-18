package com.androiddevs.mvvmnewsapp.api

import com.androiddevs.mvvmnewsapp.BuildConfig
import com.androiddevs.mvvmnewsapp.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface newsAPI {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode : String = "us",
        @Query("page")
        pageNumber : Int = 1,
        @Query("apiKEY")
        apiKey : String = BuildConfig.API_KEY
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchNews(
        @Query("q") searchQuery : String = "",
        @Query("page") pageNumber: Int = 1,
        @Query("apiKEY") apiKey: String = BuildConfig.API_KEY
    ) : Response<NewsResponse>
}