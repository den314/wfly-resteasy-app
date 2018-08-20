package pl.desz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDetails {

    private double minSalary;
    private double maxSalary;
    private String description;
    private String requirements;
    private String niceToHave;
}
