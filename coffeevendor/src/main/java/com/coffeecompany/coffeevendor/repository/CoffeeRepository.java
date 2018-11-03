package com.coffeecompany.coffeevendor.repository;

import org.springframework.stereotype.Repository;

import com.coffeecompany.coffeevendor.entity.Coffee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Integer>{

}
