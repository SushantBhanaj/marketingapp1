package com.marketingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp.entity.Leado;

public interface LeadRepository extends JpaRepository<Leado, Long> {

}
