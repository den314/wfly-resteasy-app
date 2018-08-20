package pl.desz.controller;

import pl.desz.model.JobOffer;
import pl.desz.service.JobService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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
}