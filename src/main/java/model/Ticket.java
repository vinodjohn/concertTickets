package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
@Getter
@Setter
public class Ticket {
    @Id
    Integer ticketId;
// i will think relational
    Integer scheduleId;
    Double price;
    Integer ticketNumber;



}
