package study.com.ted.fingo_ted.Models;

/**
 * Created by taewon on 2016-11-21.
 */

public class BoxOfficeResult {
    private Data[] data;

    public class Data {
        private String genre;

        private String nation_code;

        private String title;

        private String movie_img;

        private String score;

        private String first_run_date;

        private String code;

        private String viewer;

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getNation_code() {
            return nation_code;
        }

        public void setNation_code(String nation_code) {
            this.nation_code = nation_code;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMovie_img() {
            return movie_img;
        }

        public void setMovie_img(String movie_img) {
            this.movie_img = movie_img;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getFirst_run_date() {
            return first_run_date;
        }

        public void setFirst_run_date(String first_run_date) {
            this.first_run_date = first_run_date;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getViewer() {
            return viewer;
        }

        public void setViewer(String viewer) {
            this.viewer = viewer;
        }

        @Override
        public String toString() {
            return "ClassPojo [genre = " + genre + ", nation_code = " + nation_code + ", title = " + title + ", movie_img = " + movie_img + ", score = " + score + ", first_run_date = " + first_run_date + ", code = " + code + ", viewer = " + viewer + "]";
        }
    }

    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ClassPojo [data = " + data + "]";
    }
}
