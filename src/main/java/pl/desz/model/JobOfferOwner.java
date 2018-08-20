package pl.desz.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobOfferOwner {

    private String firstName;
    private String lastName;
    @JsonProperty("phone")
    private PhoneNumber phoneNumber;
}
