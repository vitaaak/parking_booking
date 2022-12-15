package com.kurgan.kursach.service;

        import com.kurgan.kursach.models.Parking;
        import org.junit.Assert;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ParkingServiceImplTest {

    @Autowired
    ParkingService parkingService;

    @Test
    public void findAll() {
        List<Parking> parking = parkingService.findAll();
        Assert.assertNotNull(parking);
    }

    @Test
    public void findByID() {
        Parking parking = parkingService.getById(1L);
        Assert.assertNotNull(parking);
    }

}



