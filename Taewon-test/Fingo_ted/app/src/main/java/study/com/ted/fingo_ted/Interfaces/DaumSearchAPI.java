package study.com.ted.fingo_ted.Interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import study.com.ted.fingo_ted.Models.DaumSearchData;

/**
 * Created by taewon on 2016-11-16.
 */

public interface DaumSearchAPI {

    @GET("/contents/movie")
    Call<DaumSearchData> getDaumData(@Query("apikey")String apikey, @Query("q")String query);
}
