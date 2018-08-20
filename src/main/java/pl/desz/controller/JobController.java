package pl.desz.controller;

import pl.desz.model.JobOffer;
import pl.desz.service.JobService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/jobs")
@Produces(value = {MediaType.APPLICATION_JSON})
public class JobController {

    @Inject
    private JobService jobService;

    @GET
    public List<JobOffer> allJobs() {
        return jobService.getAll();
    }

    @GET
    @Path("{id}")
    public JobOffer getFirstJob(@PathParam("id") String id) {
        return jobService.getById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addOffer(JobOffer newOffer) {
        final JobOffer saved = jobService.add(newOffer);

        return Response.status(Response.Status.CREATED)
                .entity(saved)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateOffer(@PathParam("id") String id, JobOffer offer) {
        jobService.update(id, offer);

        return Response.status(Response.Status.CREATED)
                .entity(offer)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }
}