package pl.desz.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JobOffer {

    private String id;
    private Company company;
    private JobOfferOwner contact;
    private String industry;
    private boolean isArchived = false;
    private LocalDateTime postedDateTime = LocalDateTime.now();
    private long applicationsCount = 0L;
    private JobDetails details;

    public JobOffer(String id, Company company, JobOfferOwner contact, String industry, JobDetails details) {
        this.id = id;
        this.company = company;
        this.contact = contact;
        this.industry = industry;
        this.details = details;
    }
}
