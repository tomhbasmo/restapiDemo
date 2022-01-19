package com.example.demo4;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



//http://localhost:8080/demo4-1.0-SNAPSHOT/api/hello-world
@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, Gruppe 2!!! XML SHIT HER";
    }
}