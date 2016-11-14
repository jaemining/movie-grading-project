package study.com.ted.fingo_ted.Models;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by PC on 2016-11-11.
 */

@Root(name = "rss", strict = false)
public class NaverSearchData {

    @Element(name = "channel")
    public Channel channel;

    @Root(name = "channel", strict = false)


    public static class Channel {

        @ElementList(required=false, inline = true, name="item")
        private List<NaverSearchResult> items;

        public List<NaverSearchResult> getItems() {
            return items;
        }
    }
}
