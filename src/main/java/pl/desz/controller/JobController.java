package pl.desz.controller;

import pl.desz.JobOfferUtil;
import pl.desz.model.JobOffer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/jobs")
public class JobController {

    @GET
    @Produces(value = {MediaType.APPLICATION_JSON})
    public List<JobOffer> allJobs() {
        return JobOfferUtil.createOffers(2);
    }

    @GET
    @Path("/1")
    @Produces(value = {MediaType.APPLICATION_JSON})
    public JobOffer getFirstJob() {
        return JobOfferUtil.createSingleOffer();
    }


}
