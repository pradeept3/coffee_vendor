package com.coffeecompany.coffeevendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffeecompany.coffeevendor.dto.CoffeeDto;
import com.coffeecompany.coffeevendor.service.CoffeeService;
import com.coffeecompany.coffeevendor.utils.Constants;


@RequestMapping("/coffee")
@Controller

public class CoffeeController {
 @Autowired
 CoffeeService coffeeService;
 @RequestMapping(Constants.GET_COFFEE_BY_ID)
 public CoffeeDto getCoffeeById(@PathVariable Integer coffeeId) {
  return coffeeService.getCoffeeById(coffeeId);
 }
 @RequestMapping(Constants.GET_ALL_COFFEES)
 public List < CoffeeDto > getAllCoffees() {
  return coffeeService.getAllCoffees();
 }
 @RequestMapping(value = Constants.SAVE_COFFEE, method = RequestMethod.POST)
 public void saveUser(@RequestBody CoffeeDto coffeeDto) {
  coffeeService.saveCoffee(coffeeDto);
 }
}