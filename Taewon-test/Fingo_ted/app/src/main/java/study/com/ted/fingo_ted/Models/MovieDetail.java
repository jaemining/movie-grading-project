package study.com.ted.fingo_ted.Models;

/**
 * Created by taewon on 2016-11-21.
 */

public class MovieDetail
{
    private Stillcut_set[] stillcut_set;

    private String genre;

    private String story;

    private String nation_code;

    private String title;

    private String movie_img;

    private String score;

    private String first_run_date;

    private Actor[] actor;

    private String code;

    private Director[] director;

    private String viewer;

    public Stillcut_set[] getStillcut_set() {
        return stillcut_set;
    }

    public class Stillcut_set
    {
        public String stiicut_img;

        public String getStiicut_img() {
            return stiicut_img;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [stiicut_img = "+stiicut_img+"]";
        }
    }

    public class Actor
    {
        private String name;

        private String code;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getCode ()
        {
            return code;
        }

        public void setCode (String code)
        {
            this.code = code;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", code = "+code+"]";
        }
    }

    public class Director
    {
        private String name;

        private String code;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getCode ()
        {
            return code;
        }

        public void setCode (String code)
        {
            this.code = code;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", code = "+code+"]";
        }
    }

    public String getGenre ()
    {
        return genre;
    }

    public void setGenre (String genre)
    {
        this.genre = genre;
    }

    public String getStory ()
    {
        return story;
    }

    public void setStory (String story)
    {
        this.story = story;
    }

    public String getNation_code ()
    {
        return nation_code;
    }

    public void setNation_code (String nation_code)
    {
        this.nation_code = nation_code;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getMovie_img ()
    {
        return movie_img;
    }

    public void setMovie_img (String movie_img)
    {
        this.movie_img = movie_img;
    }

    public String getScore ()
    {
        return score;
    }

    public void setScore (String score)
    {
        this.score = score;
    }

    public String getFirst_run_date ()
    {
        return first_run_date;
    }

    public void setFirst_run_date (String first_run_date)
    {
        this.first_run_date = first_run_date;
    }

    public Actor[] getActor ()
    {
        return actor;
    }

    public void setActor (Actor[] actor)
    {
        this.actor = actor;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public Director[] getDirector ()
    {
        return director;
    }

    public void setDirector (Director[] director)
    {
        this.director = director;
    }

    public String getViewer ()
    {
        return viewer;
    }

    public void setViewer (String viewer)
    {
        this.viewer = viewer;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [stillcut_set = "+stillcut_set+", genre = "+genre+", story = "+story+", nation_code = "+nation_code+", title = "+title+", movie_img = "+movie_img+", score = "+score+", first_run_date = "+first_run_date+", actor = "+actor+", code = "+code+", director = "+director+", viewer = "+viewer+"]";
    }
}