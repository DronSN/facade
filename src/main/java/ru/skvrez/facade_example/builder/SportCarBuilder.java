package ru.skvrez.facade_example.builder;

import ru.skvrez.facade_example.Car;

public class SportCarBuilder extends AbstractCarBuilder {

    public SportCarBuilder(Car car) {
        super(car);
    }

    @Override
    public void setEngine() {
        appendCarDescription("Установлен мотор повышеной мощности");
    }

    @Override
    public void buildSaloon() {
        appendCarDescription("Установлен тканевый салон со вставками под карбон");
    }

    @Override
    public void paintCar() {
        appendCarDescription("Автомобиль покрашен в цвет british green");
    }
}
