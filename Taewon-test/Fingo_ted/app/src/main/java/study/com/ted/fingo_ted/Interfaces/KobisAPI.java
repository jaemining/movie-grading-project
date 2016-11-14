package study.com.ted.fingo_ted.Interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import study.com.ted.fingo_ted.Models.KobisData;

/**
 * Created by PC on 2016-11-11.
 */

public interface KobisAPI {

    @GET("webservice/rest/boxoffice/searchDailyBoxOfficeList.json")
    Call<KobisData> getData(@Query("key") String key, @Query("targetDt") String targetDt);
}
