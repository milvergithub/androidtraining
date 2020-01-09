package com.transoft.salesapp.api;

import com.transoft.salesapp.model.PickUp;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface PickUpService {

    @GET("ticket/?")
    Observable<List<PickUp>> getPickUps(@Query("limit") String limit);
}
