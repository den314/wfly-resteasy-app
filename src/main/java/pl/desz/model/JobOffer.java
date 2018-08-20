package pl.desz.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JobOffer {

    private String id;
    private Company company;
    private JobOfferOwner contact;
    private String industry;
    private boolean isArchived = false;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
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
