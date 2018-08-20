package pl.desz.repository;

import pl.desz.exception.JobAlreadyExistsException;
import pl.desz.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MockJobOfferRepository {

    private static Map<String, JobOffer> OFFERS = new HashMap<>();

    static {
        OFFERS.put("1", new JobOffer("1", new Company("EXAMPLE CO."),
                new JobOfferOwner("John", "Doe", new PhoneNumber("502331889")), "IT",
                new JobDetails(7000.0d, 12000.0d,
                        "really nice job", "everything", "also everything")));

        OFFERS.put("2", new JobOffer("2", new Company("EXAMPLE CO."),
                new JobOfferOwner("John", "Doe", new PhoneNumber("502331889")), "IT",
                new JobDetails(9000.0d, 11000.0d,
                        "really nice job", "everything", "also everything")));

        OFFERS.put("3", new JobOffer("3", new Company("ME AND OTHERS CO."),
                new JobOfferOwner("Alfred", "Doe", new PhoneNumber("711-313-101")), "Other",
                new JobDetails(2500.0d, 5000.0d,
                        "medium job", "not much", "a least something")));
    }

    public static JobOffer getById(String id) {
        return OFFERS.get(id);
    }

    public static List<JobOffer> getAll() {
        return new ArrayList<>(OFFERS.values());
    }

    public static JobOffer save(JobOffer newOffer) {
        final String id = newOffer.getId();
        if (OFFERS.containsKey(id)) {
            throw new JobAlreadyExistsException(id);
        }
        OFFERS.put(id, newOffer);
        return newOffer;
    }
}
