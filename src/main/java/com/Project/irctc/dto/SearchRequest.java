package com.Project.irctc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {

    private String boardingPoint;
    private String destination;
    private String date;

    @Override
    public String toString() {
        return "SearchRequest{" +
                "boardingPoint='" + boardingPoint + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
