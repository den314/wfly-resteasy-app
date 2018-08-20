package pl.desz.service;

import pl.desz.model.JobOffer;

import java.util.List;

public interface JobService {

    List<JobOffer> getAll();
    JobOffer getById(String id);
}
