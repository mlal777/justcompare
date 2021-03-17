package myapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(Compare.COMPARE)
public class Compare {

    static final String COMPARE = "/compare";

    @GET
    public String get() {
        return "Hello, we compare stuff from amazon.";
    }
}