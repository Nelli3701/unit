import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    Car car = new Car("VAZ", "Lada", 2020);
    Motorcycle moto = new Motorcycle("BMW", "R 1250 RT", 2021);
    //Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
    // (используя оператор instanceof)

    @Test
    public void testCarInstanceVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    //Проверить, что объект Car создается с 4-мя колесами
    @Test
    public void testCarNumberOfWheels() {
        assertEquals(car.getNumWheels(), 4);
    }

    //Проверить, что объект Motorcycle создается с 2-мя колесами

    @Test
    public void testMotoNumberOfWheels() {
        assertEquals(moto.getNumWheels(), 2);
    }

    //Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
    // (используя метод testDrive())

    @Test
    public void testCarTestDriveSpeed() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    //Проверить, что объект Motorcycle развивает скорость 75
    // в режиме тестового вождения (используя метод testDrive())

    @Test
    public void testMotoTestDriveSpeed() {
        moto.testDrive();
        assertEquals(moto.getSpeed(), 75);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // машина останавливается (speed = 0)

    @Test
    public void testCarParkSpeed() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0).
    @Test
    public void testMotoParkSpeed() {
        moto.testDrive();
        moto.park();
        assertEquals(moto.getSpeed(), 0);
    }


}
