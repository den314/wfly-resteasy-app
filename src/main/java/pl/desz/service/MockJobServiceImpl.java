package pl.desz.service;

import pl.desz.model.JobOffer;
import pl.desz.util.JobOfferUtil;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class MockJobServiceImpl implements JobService {

    @Override
    public List<JobOffer> getAll() {
        return JobOfferUtil.createOffers(2);
    }

    @Override
    public JobOffer getById(String id) {
        return JobOfferUtil.createSingleOffer();
    }
}
