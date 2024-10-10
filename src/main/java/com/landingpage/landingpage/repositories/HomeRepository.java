package com.landingpage.landingpage.repositories;

import com.landingpage.landingpage.domain.home.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long>{
}
