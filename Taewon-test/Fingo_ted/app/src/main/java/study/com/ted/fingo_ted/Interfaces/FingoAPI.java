package study.com.ted.fingo_ted.Interfaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import study.com.ted.fingo_ted.Models.BoxOfficeResult;
import study.com.ted.fingo_ted.Models.MovieDetail;

/**
 * Created by taewon on 2016-11-21.
 *
 * BASE_URL         : fingo-test.ijvmwrmuhi.ap-northeast-2.elasticbeanstalk.com
 * BOX_OFFICE_LIST  : /api/movie/boxoffice_list/
 * MOVIE_DETAIL     : /api/movie/moviedetail/[영화 ID]/
 *
 */

public interface FingoAPI {

    @GET("/api/movie/boxoffice_list")
    Call<BoxOfficeResult> getBoxOfficeList();

    @GET("/api/movie/search/")
    Call<MovieDetail> getSearchDetail(@Query("q") String query);

    @GET("/api/movie/moviedetail/{Movie_ID}")
    Call<MovieDetail> getMovieDetail(@Path("Movie_ID")String movie_id);

}
