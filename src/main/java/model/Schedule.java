package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "schedules")
@Getter
@Setter
public class Schedule {
    @Id
    Integer scheduleId;
    Date startTime;
    Concert concert;


}
