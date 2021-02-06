package data.model;

import data.constance.Sex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ServiceProvider {
    private String id;
    private String name;
    private LocalDate Worksince;
    private String typeOfWork;
    private LocalDate dateOfBirth;
    private String portfolio;
    private String photo;
    private LocalDate timeofbegin;
    private  LocalDate timeofend;
    private Sex gender;



}
