package study.com.ted.fingo_ted.Interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import study.com.ted.fingo_ted.Models.NaverSearchData;

/**
 * Created by PC on 2016-11-11.
 */

public interface NaverSearchAPI {

    @Headers({
            "X-Naver-Client-Id: yENwphZG7JRv01mCY0F8", "X-Naver-Client-Secret: _3ktvDPiRT"
    })
    @GET("v1/search/movie.xml")
    Call<NaverSearchData> getData(@Query("query") String query);
//    , @Query("display")int display, @Query("start") int start
}
