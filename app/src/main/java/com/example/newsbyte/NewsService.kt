package com.example.newsbyte

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


const val BASE_URL = "https://newsapi.org"
const val API_KEY = "51d98ee0d93e47f991ce419725fc549d"

interface NewsInterface {

    @GET("/v2/top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country") country: String, @Query("page") Page: Int): Call<News>
    // This getHeadlines fun with result in calling following url :
    // http://newsapi.org/v2/top-headlines?apiKey=51d98ee0d93e47f991ce419725fc549d&country=in&page=1
}

object NewsService {
    val newsInstance: NewsInterface

    init {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        newsInstance = retrofit.create(NewsInterface::class.java)
    }

}
