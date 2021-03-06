package pl.desz.service;

import pl.desz.model.JobOffer;

import java.util.List;

public interface JobService {

    List<JobOffer> getAll();
    JobOffer getById(String id);
    JobOffer add(JobOffer newOffer);
    JobOffer update(String id, JobOffer offer);
    boolean delete(String id);
    boolean delete(JobOffer offer);
}
