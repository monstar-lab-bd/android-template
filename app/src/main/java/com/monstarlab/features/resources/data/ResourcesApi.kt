package com.monstarlab.features.resources.data

import com.monstarlab.core.data.network.responses.ResourcesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ResourcesApi {
    @GET("unknown")
    suspend fun getResources(@Query("page") page: Int = 1): Response<ResourcesResponse>
}
