package com.kurgan.kursach.service;

import com.kurgan.kursach.models.Car;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

    @SpringBootTest
    @RunWith(SpringRunner.class)
    public class CarServiceImplTest {

        @Autowired
        CarService carService;

        @Test
        public void findAll() {
            List<Car> cars = carService.findAll();
            Assert.assertNotNull(cars);
        }

        @Test
        public void findById() {
            Car cars = carService.findById(1L);
            Assert.assertNotNull(cars);
        }

    }

