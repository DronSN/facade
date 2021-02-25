package ru.skvrez.facade_example;

import org.junit.jupiter.api.Test;
import ru.skvrez.facade_example.enums.CarEquipmentLevel;
import ru.skvrez.facade_example.enums.CarModel;

class CarProducerTest {

    @Test
    void getMyCar() {
        CarProducer carProducer = new CarDirector();
        Car car = carProducer.getMyCar(CarModel.SOLARIS, CarEquipmentLevel.LUX);
        System.out.println(car);

        Car nextCar = carProducer.getMyCar(CarModel.SONATA, CarEquipmentLevel.SPORT);
        System.out.println(nextCar);

        Car nextNextCar = carProducer.getMyCar(CarModel.CRETA, CarEquipmentLevel.BUSINESS);
        System.out.println(nextNextCar);
    }
}
