package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "audience")
@Getter
@Setter
public class Audience {
    @Id
    Long audienceId;
    String firstName;
    String lastName;
    @OneToMany(mappedBy = "audience")
    List<Ticket> ticketList;
}
