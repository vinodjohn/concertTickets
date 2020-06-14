package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    Integer userId;
    String firstName;
    String lastName;
    @OneToMany(mappedBy = "users")
    List<Ticket> ticketList;
}
