package com.demo.petstore.resources;


import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("newsletter")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class NewsLetterResources {

    @GET
    @Path("ping")
    public Response pingResource() {
        return Response.status(Response.Status.OK).build();
    }


    // TODO save email for newsletter


    // TODO remove email from newsletter


    // TODO retrieve all the members of the newsletter



}
