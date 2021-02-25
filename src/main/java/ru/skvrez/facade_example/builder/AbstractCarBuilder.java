package ru.skvrez.facade_example.builder;

import ru.skvrez.facade_example.Car;

public abstract class AbstractCarBuilder implements CarBuilder {

    protected Car car;
    private static final String DELIMITER = "\n";

    protected AbstractCarBuilder(Car car) {
        this.car = car;
    }

    protected void appendCarDescription(String description) {
        if (car != null) {
            car.setDescription(String.format("%s %s %s", car.getDescription(), DELIMITER, description));
        }
    }

    @Override
    public Car getCar() {
        return car;
    }

}
