package com.project.roomescape.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Rank {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String teamName;

    @Column(nullable = false)
    private String time;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private Long roomId;

    @Column(nullable = false)
    private Integer userNum;



    public Rank(String teamName, String time, Long roomId, Integer userNum, String comment) {

        this.teamName = teamName;
        this.time = time;
        this.roomId = roomId;
        this.userNum = userNum;
        this.comment = comment;
    }



}
