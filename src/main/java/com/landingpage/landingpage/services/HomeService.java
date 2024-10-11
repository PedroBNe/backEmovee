package com.landingpage.landingpage.services;

import com.landingpage.landingpage.domain.home.Home;
import com.landingpage.landingpage.repositories.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public Home findHome() {
        return homeRepository.findById(1L).orElse(null);
    }

    public Home findById(Long id) {
        return homeRepository.findById(id).orElse(null);
    }

    public Home save(Home home) {
        return homeRepository.save(home);
    }

    public void deleteById(Long id) {
        homeRepository.deleteById(id);
    }

    public Home updateHome(Long id, Home updatedHome) {
        Home existingHome = findById(id);

        if (existingHome != null) {

            if (updatedHome.getLogo() != null) {
                existingHome.setLogo(updatedHome.getLogo());
            }

            if (updatedHome.getNavbar() != null) {
                existingHome.getNavbar().clear();
                existingHome.getNavbar().addAll(updatedHome.getNavbar());
            }

            if (updatedHome.getCarouselImages() != null) {
                existingHome.setCarouselImages(updatedHome.getCarouselImages());
            }

            if (updatedHome.getAbout() != null) {
                existingHome.setAbout(updatedHome.getAbout());
            }

            if (updatedHome.getImagesWho() != null) {
                existingHome.setImagesWho(updatedHome.getImagesWho());
            }

            if (updatedHome.getEmail() != null) {
                existingHome.setEmail(updatedHome.getEmail());
            }

            if (updatedHome.getNumber() != null) {
                existingHome.setNumber(updatedHome.getNumber());
            }

            if (updatedHome.getAddress() != null) {
                existingHome.setAddress(updatedHome.getAddress());
            }

            if (updatedHome.getPoliticas() != null) {
                existingHome.setPoliticas(updatedHome.getPoliticas());
            }

            if (updatedHome.getCookies() != null) {
                existingHome.setCookies(updatedHome.getCookies());
            }

            if (updatedHome.getWhatsapp() != null) {
                existingHome.setWhatsapp(updatedHome.getWhatsapp());
            }

            if (updatedHome.getFacebook() != null) {
                existingHome.setFacebook(updatedHome.getFacebook());
            }

            if (updatedHome.getInstagram() != null) {
                existingHome.setInstagram(updatedHome.getInstagram());
            }

            return homeRepository.save(existingHome);
        } else {
            return null;
        }
    }
}
