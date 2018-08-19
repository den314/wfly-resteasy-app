package pl.desz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobOfferOwner {

    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
}
