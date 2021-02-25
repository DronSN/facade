package ru.skvrez.facade_example;

import ru.skvrez.facade_example.builder.BusinessCarBuilder;
import ru.skvrez.facade_example.builder.CarBuilder;
import ru.skvrez.facade_example.builder.LuxCarBuilder;
import ru.skvrez.facade_example.builder.SportCarBuilder;
import ru.skvrez.facade_example.enums.CarEquipmentLevel;
import ru.skvrez.facade_example.enums.CarModel;

public class CarDirector implements CarProducer {

    private CarBuilder builder;
    private static final String CAR_TITLE = "Комплектация автомобиля:";

    @Override
    public Car getMyCar(CarModel carModel, CarEquipmentLevel carEquipmentLevel) {
        if (carEquipmentLevel == CarEquipmentLevel.LUX) {
            builder = new LuxCarBuilder(new Car(carModel, carEquipmentLevel, CAR_TITLE));
        } else if (carEquipmentLevel == CarEquipmentLevel.SPORT) {
            builder = new SportCarBuilder(new Car(carModel, carEquipmentLevel, CAR_TITLE));
        } else if (carEquipmentLevel == CarEquipmentLevel.BUSINESS) {
            builder = new BusinessCarBuilder(new Car(carModel, carEquipmentLevel, CAR_TITLE));
        }
        return buildCar();
    }

    private Car buildCar() {
        builder.buildSaloon();
        builder.setEngine();
        builder.paintCar();
        return builder.getCar();
    }
}
