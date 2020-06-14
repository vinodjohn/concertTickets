package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(GenerationType.AUTO)
    Long ticketId;
    int scheduleId;
    int ticketNumber;
    TicketCategory ticketCategory;
}
