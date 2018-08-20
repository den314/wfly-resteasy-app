package pl.desz.controller;

import pl.desz.model.JobOffer;
import pl.desz.service.JobService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
    @Path("/1")
    public JobOffer getFirstJob() {
        return jobService.getById("1");
    }
}