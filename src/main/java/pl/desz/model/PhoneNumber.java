package pl.desz.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PhoneNumber {

    @Getter
    private String number;

    public PhoneNumber(String number) {
        setNumber(number);
    }

    public void setNumber(String number) {
        if (!isValid(number)) {
            throw new IllegalArgumentException("Phone number is not valid.");
        }
        this.number = number;
    }

    private boolean isValid(String number) {
        return number.matches("\\d{3}-?\\d{3}-?\\d{3}");
    }
}
