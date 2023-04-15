package org.example.view;
import java.time.LocalDate;
import java.time.LocalTime;
public class Log implements LogService {
    public Log(String message) {
        System.out.println("Date: " + LocalDate.now() + ", time: " + LocalTime.now() + ", LOG" +
                " for "+ message +" initialised.");
    }
    @Override
    public void print(String message) {
        System.out.println("Date: " + LocalDate.now() + ", time: " + LocalTime.now() + ", LOG message: " + message);
    }
}
