package pl.desz.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobOfferOwner {

    private String firstName;
    private String lastName;
    @JsonProperty("phone")
    private PhoneNumber phoneNumber;
}
