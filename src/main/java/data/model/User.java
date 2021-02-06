package data.model;

import data.constance.Sex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String id;
    private String name;
    private LocalDate dateOfBirths;
    private Sex gender;





}
