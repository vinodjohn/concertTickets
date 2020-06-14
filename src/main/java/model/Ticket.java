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
    int scheduleId;
    int ticketNumber;
    @ManyToOne
    @JoinColumn(name = "ticketCategoryId")
    TicketCategory ticketCategory;



}
