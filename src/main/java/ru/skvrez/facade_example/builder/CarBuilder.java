package ru.skvrez.facade_example.builder;

import ru.skvrez.facade_example.Car;

public interface CarBuilder {
    void setEngine();
    void buildSaloon();
    void paintCar();
    Car getCar();
}
