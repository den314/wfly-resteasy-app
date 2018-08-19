package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class Hello {

    @GET
    public String sayHello() {
        return "Hi there, it's working";
    }
}
