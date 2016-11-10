package study.com.ted.fingo_ted.Models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by PC on 2016-11-11.
 */

@Root(name = "item")
public class NaverSearchResult {

    @Element(required=false)
    private String title;
    @Element(required=false)
    private String link;
    @Element(required=false)
    private String image;
    @Element(required=false)
    private String subtitle;
    @Element(required=false)
    private String pubDate;
    @Element(required=false)
    private String director;
    @Element(required=false)
    private String actor;
    @Element(required=false)
    private String userRating;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getSubTitle() {
        return subtitle;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    public String getUserRating() {
        return userRating;
    }
}