package pl.desz.service;

import pl.desz.model.JobOffer;
import pl.desz.repository.MockJobOfferRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class MockJobServiceImpl implements JobService {

    @Override
    public List<JobOffer> getAll() {
        return MockJobOfferRepository.getAll();
    }

    @Override
    public JobOffer getById(String id) {
        return MockJobOfferRepository.getById(id);
    }

    @Override
    public JobOffer add(JobOffer newOffer) {
        return MockJobOfferRepository.save(newOffer);
    }
}
