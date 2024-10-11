package com.landingpage.landingpage.domain.home;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "home")
@Getter
@Setter
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "home_id")
    private List<NavbarItem> navbar = new ArrayList<>();

    @ElementCollection
    private List<String> carouselImages;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private About about;

    @ElementCollection
    private List<String> ImagesWho;

    private String email;
    private String number;
    private String address;
    private String politicas;
    private String cookies;
    private String whatsapp;
    private String facebook;
    private String instagram;
}
