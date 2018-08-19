package pl.desz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobDetails {

    private double minSalary;
    private double maxSalary;
    private String description;
    private String requirements;
    private String niceToHave;
}
