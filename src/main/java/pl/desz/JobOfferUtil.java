package pl.desz;

import pl.desz.model.*;

import java.util.ArrayList;
import java.util.List;

public final class JobOfferUtil {

    public static JobOffer createSingleOffer() {
        return new JobOffer("1", new Company("EXAMPLE CO."),
                new JobOfferOwner("John", "Doe", new PhoneNumber("502331889")), "IT",
                new JobDetails(7000.0d, 12000.0d,
                        "really nice job", "everything", "also everything"));
    }

    public static List<JobOffer> createOffers(int number) {
        ArrayList<JobOffer> offers = new ArrayList<>();

        offers.add(new JobOffer("1", new Company("EXAMPLE CO."),
                new JobOfferOwner("John", "Doe", new PhoneNumber("502331889")), "IT",
                new JobDetails(7000.0d, 12000.0d,
                        "really nice job", "everything", "also everything")));

        offers.add(new JobOffer("2", new Company("ME AND OTHERS CO."),
                new JobOfferOwner("Alfred", "Doe", new PhoneNumber("711-313-101")), "Other",
                new JobDetails(2500.0d, 5000.0d,
                        "medium job", "not much", "a least something")));

        return offers;
    }
}
