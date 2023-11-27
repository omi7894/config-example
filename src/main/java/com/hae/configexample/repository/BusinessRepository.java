package com.hae.configexample.repository;

import com.hae.configexample.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessRepository extends JpaRepository<Business, String> {
    List<Business> findAllByCode(String id);
}
