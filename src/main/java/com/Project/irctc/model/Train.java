package com.Project.irctc.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Train {

    @Id
    private Integer Id;
    private String trainName;
    private Long trainNumber;
    private String boardingPoint;
    private String destinationPoint;
    private Time boardingTime;
    private Time destinationTime;
    private Date date;
    private Integer numberOfSeats;
}