package com.landingpage.landingpage.domain.onlineClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "online_class")
@Getter
@Setter
public class OnlineClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String subTitle;
    private String image;
    private Date date;
    private String students;
}
