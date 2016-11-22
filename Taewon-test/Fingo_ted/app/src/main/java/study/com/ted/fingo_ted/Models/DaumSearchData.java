package study.com.ted.fingo_ted.Models;

/**
 * Created by taewon on 2016-11-16.
 */

public class DaumSearchData {

    private Channel channel;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "ClassPojo [channel = " + channel + "]";
    }

    private class Channel {

        private String result;

        private String title;

        private String totalCount;

        private String page;

        private String q;

        private Item[] item;

        private String debug;

        private String pk;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(String totalCount) {
            this.totalCount = totalCount;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public String getQ() {
            return q;
        }

        public void setQ(String q) {
            this.q = q;
        }

        public Item[] getItem() {
            return item;
        }

        public void setItem(Item[] item) {
            this.item = item;
        }

        public String getDebug() {
            return debug;
        }

        public void setDebug(String debug) {
            this.debug = debug;
        }

        public String getPk() {
            return pk;
        }

        public void setPk(String pk) {
            this.pk = pk;
        }

        @Override
        public String toString() {
            return "ClassPojo [result = " + result + ", title = " + title + ", totalCount = " + totalCount + ", page = " + page + ", q = " + q + ", item = " + item + ", debug = " + debug + ", pk = " + pk + "]";
        }

        private class Item {

            private Genre[] genre;

            private Res[] res;

            private Trailer[] trailer;

            private Photo1 photo1;

            private Actor[] actor;

            private Write_grades[] write_grades;

            private Story[] story;

            private Title[] title;

            private Audience_date[] audience_date;

            private Event[] event;

            private Video_info[] video_info;

            private More_actor[] more_actor;

            private Photo_info[] photo_info;

            private Year[] year;

            private Ogr_title[] ogr_title;

            private Video[] video;

            private Kword[] kword;

            private Open_info[] open_info;

            private Audience[] audience;

            private Director[] director;

            private Nation[] nation;

            private Homepage[] homepage;

            private Category[] category;

            private Thumbnail[] thumbnail;

            private Eng_title[] eng_title;

            private Grade3[] grade3;

            private Expect_grades[] expect_grades;

            private Grades[] grades;

            private Photo2 photo2;

            private Photo3 photo3;

            private Wiki_url[] wiki_url;

            private Grade1[] grade1;

            private Photo4 photo4;

            private Grade2[] grade2;

            private Photo5 photo5;

            public Genre[] getGenre ()
            {
                return genre;
            }

            public void setGenre (Genre[] genre)
            {
                this.genre = genre;
            }

            public Res[] getRes ()
            {
                return res;
            }

            public void setRes (Res[] res)
            {
                this.res = res;
            }

            public Trailer[] getTrailer ()
            {
                return trailer;
            }

            public void setTrailer (Trailer[] trailer)
            {
                this.trailer = trailer;
            }

            public Photo1 getPhoto1 ()
            {
                return photo1;
            }

            public void setPhoto1 (Photo1 photo1)
            {
                this.photo1 = photo1;
            }

            public Actor[] getActor ()
            {
                return actor;
            }

            public void setActor (Actor[] actor)
            {
                this.actor = actor;
            }

            public Write_grades[] getWrite_grades ()
            {
                return write_grades;
            }

            public void setWrite_grades (Write_grades[] write_grades)
            {
                this.write_grades = write_grades;
            }

            public Story[] getStory ()
            {
                return story;
            }

            public void setStory (Story[] story)
            {
                this.story = story;
            }

            public Title[] getTitle ()
            {
                return title;
            }

            public void setTitle (Title[] title)
            {
                this.title = title;
            }

            public Audience_date[] getAudience_date ()
            {
                return audience_date;
            }

            public void setAudience_date (Audience_date[] audience_date)
            {
                this.audience_date = audience_date;
            }

            public Event[] getEvent ()
            {
                return event;
            }

            public void setEvent (Event[] event)
            {
                this.event = event;
            }

            public Video_info[] getVideo_info ()
            {
                return video_info;
            }

            public void setVideo_info (Video_info[] video_info)
            {
                this.video_info = video_info;
            }

            public More_actor[] getMore_actor ()
            {
                return more_actor;
            }

            public void setMore_actor (More_actor[] more_actor)
            {
                this.more_actor = more_actor;
            }

            public Photo_info[] getPhoto_info ()
            {
                return photo_info;
            }

            public void setPhoto_info (Photo_info[] photo_info)
            {
                this.photo_info = photo_info;
            }

            public Year[] getYear ()
            {
                return year;
            }

            public void setYear (Year[] year)
            {
                this.year = year;
            }

            public Ogr_title[] getOgr_title ()
            {
                return ogr_title;
            }

            public void setOgr_title (Ogr_title[] ogr_title)
            {
                this.ogr_title = ogr_title;
            }

            public Video[] getVideo ()
            {
                return video;
            }

            public void setVideo (Video[] video)
            {
                this.video = video;
            }

            public Kword[] getKword ()
            {
                return kword;
            }

            public void setKword (Kword[] kword)
            {
                this.kword = kword;
            }

            public Open_info[] getOpen_info ()
            {
                return open_info;
            }

            public void setOpen_info (Open_info[] open_info)
            {
                this.open_info = open_info;
            }

            public Audience[] getAudience ()
            {
                return audience;
            }

            public void setAudience (Audience[] audience)
            {
                this.audience = audience;
            }

            public Director[] getDirector ()
            {
                return director;
            }

            public void setDirector (Director[] director)
            {
                this.director = director;
            }

            public Nation[] getNation ()
            {
                return nation;
            }

            public void setNation (Nation[] nation)
            {
                this.nation = nation;
            }

            public Homepage[] getHomepage ()
            {
                return homepage;
            }

            public void setHomepage (Homepage[] homepage)
            {
                this.homepage = homepage;
            }

            public Category[] getCategory ()
            {
                return category;
            }

            public void setCategory (Category[] category)
            {
                this.category = category;
            }

            public Thumbnail[] getThumbnail ()
            {
                return thumbnail;
            }

            public void setThumbnail (Thumbnail[] thumbnail)
            {
                this.thumbnail = thumbnail;
            }

            public Eng_title[] getEng_title ()
            {
                return eng_title;
            }

            public void setEng_title (Eng_title[] eng_title)
            {
                this.eng_title = eng_title;
            }

            public Grade3[] getGrade3 ()
            {
                return grade3;
            }

            public void setGrade3 (Grade3[] grade3)
            {
                this.grade3 = grade3;
            }

            public Expect_grades[] getExpect_grades ()
            {
                return expect_grades;
            }

            public void setExpect_grades (Expect_grades[] expect_grades)
            {
                this.expect_grades = expect_grades;
            }

            public Grades[] getGrades ()
            {
                return grades;
            }

            public void setGrades (Grades[] grades)
            {
                this.grades = grades;
            }

            public Photo2 getPhoto2 ()
            {
                return photo2;
            }

            public void setPhoto2 (Photo2 photo2)
            {
                this.photo2 = photo2;
            }

            public Photo3 getPhoto3 ()
            {
                return photo3;
            }

            public void setPhoto3 (Photo3 photo3)
            {
                this.photo3 = photo3;
            }

            public Wiki_url[] getWiki_url ()
            {
                return wiki_url;
            }

            public void setWiki_url (Wiki_url[] wiki_url)
            {
                this.wiki_url = wiki_url;
            }

            public Grade1[] getGrade1 ()
            {
                return grade1;
            }

            public void setGrade1 (Grade1[] grade1)
            {
                this.grade1 = grade1;
            }

            public Photo4 getPhoto4 ()
            {
                return photo4;
            }

            public void setPhoto4 (Photo4 photo4)
            {
                this.photo4 = photo4;
            }

            public Grade2[] getGrade2 ()
            {
                return grade2;
            }

            public void setGrade2 (Grade2[] grade2)
            {
                this.grade2 = grade2;
            }

            public Photo5 getPhoto5 ()
            {
                return photo5;
            }

            public void setPhoto5 (Photo5 photo5)
            {
                this.photo5 = photo5;
            }

            @Override
            public String toString()
            {
                return "ClassPojo [genre = "+genre+", res = "+res+", trailer = "+trailer+", photo1 = "+photo1+", actor = "+actor+", write_grades = "+write_grades+", story = "+story+", title = "+title+", audience_date = "+audience_date+", event = "+event+", video_info = "+video_info+", more_actor = "+more_actor+", photo_info = "+photo_info+", year = "+year+", ogr_title = "+ogr_title+", video = "+video+", kword = "+kword+", open_info = "+open_info+", audience = "+audience+", director = "+director+", nation = "+nation+", homepage = "+homepage+", category = "+category+", thumbnail = "+thumbnail+", eng_title = "+eng_title+", grade3 = "+grade3+", expect_grades = "+expect_grades+", grades = "+grades+", photo2 = "+photo2+", photo3 = "+photo3+", wiki_url = "+wiki_url+", grade1 = "+grade1+", photo4 = "+photo4+", grade2 = "+grade2+", photo5 = "+photo5+"]";
            }

            private class Grade2{

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Photo5 {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Wiki_url {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Grade1 {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Photo4 {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Photo3 {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Expect_grades {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Grades {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Photo2 {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Grade3 {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Eng_title {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Thumbnail {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Category {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Homepage {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Nation {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Director {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Audience {

                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Genre{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Res{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Trailer{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Photo1 {
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Actor{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Write_grades{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Story{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Title{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Audience_date{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Event{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Video_info{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class More_actor{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Photo_info{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Year{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Ogr_title{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Video{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Kword{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }

            private class Open_info{
                private String content;

                private String link;

                public String getContent ()
                {
                    return content;
                }

                public void setContent (String content)
                {
                    this.content = content;
                }

                public String getLink ()
                {
                    return link;
                }

                public void setLink (String link)
                {
                    this.link = link;
                }

                @Override
                public String toString()
                {
                    return "ClassPojo [content = "+content+", link = "+link+"]";
                }
            }
        }

    }

}
