package com.landingpage.landingpage.controllers;

import com.landingpage.landingpage.domain.home.Home;
import com.landingpage.landingpage.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping
    public Home getHome() {
        return homeService.findHome();
    }

    @GetMapping("/{id}")
    public Home getHomeById(@PathVariable Long id) {
        return homeService.findById(id);
    }

    @PostMapping
    public Home createHome(@RequestBody Home home) {
        return homeService.save(home);
    }

    @DeleteMapping("/{id}")
    public void deleteHome(@PathVariable Long id) {
        homeService.deleteById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/{id}")
    public Home updateHome(@PathVariable Long id, @RequestBody Home updatedHome) {
        return homeService.updateHome(id, updatedHome);
    }
}
