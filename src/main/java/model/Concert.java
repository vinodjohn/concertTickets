package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "concerts")
@Getter
@Setter
public class Concert {
    @Id
    Long concertId;
//i will think relational
    String genre; // we can use enum
    String SingerName;
}
