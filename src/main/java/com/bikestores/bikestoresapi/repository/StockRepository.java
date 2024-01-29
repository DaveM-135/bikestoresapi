package com.bikestores.bikestoresapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikestores.bikestoresapi.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {
    
}
