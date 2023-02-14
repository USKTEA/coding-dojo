import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    void calculateParkingFee1() {
        Car car = new Car("1234");

        car.in(960);
        car.out(1080);
        car.in(1438);

        Rule rule = new Rule(120, 0, 60, 591);

        int parkingFee = car.calculateParkingFee(rule);

        assertEquals(parkingFee, 591);
    }

    @Test
    void calculateParkingFee2() {
        Car car = new Car("1234");

        car.in(0);

        Rule rule = new Rule(1, 461, 1, 10);

        int parkingFee = car.calculateParkingFee(rule);

        assertEquals(parkingFee, 14841);
    }

    @Test
    void calculateParkingFee3() {
        Car car = new Car("0000");
        Rule rule = new Rule(180, 5000, 10, 600);

        car.in(360);
        car.out(394);
        car.in(1139);

        int parkingFee = car.calculateParkingFee(rule);

        assertEquals(parkingFee, 14600);
    }
}
