package data.model;

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
public class Appointment {
    private LocalDateTime timeofbegining;
    private  LocalDateTime timeofend;
    private LocalDateTime appointmentregistrationtime;
    private User serviveresiever;
    private ServiceProvider serviceProvider;
    private String description;
}
