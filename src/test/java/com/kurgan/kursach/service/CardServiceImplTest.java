package com.kurgan.kursach.service;

import com.kurgan.kursach.models.Card;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CardServiceImplTest {

    @Autowired
    CardService cardService;

    @Test
    public void findAll() {
        List<Card> cards = cardService.findAll();
        Assert.assertNotNull(cards);
    }

    @Test
    public void findById() {
        Card card = cardService.findById(1L);
        Assert.assertNotNull(card);
    }

    @Test
    public void findAllByDiscount() {
        List<Card> cards = cardService.findAllByDiscount(20);
        Assert.assertNotNull(cards);
    }
}