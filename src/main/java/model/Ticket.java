package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket {
    @Id
    Long ticketId;
// i will think relational
    int scheduleId;
    BigDecimal price;
    int ticketNumber;



}
