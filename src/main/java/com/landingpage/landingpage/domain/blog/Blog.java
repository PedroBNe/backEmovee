package com.landingpage.landingpage.domain.blog;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "blog")
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String subTitle;
    private Date date;
    private String content;
    private String image;

    @OneToOne(cascade = CascadeType.ALL)
    private Category category;
}
