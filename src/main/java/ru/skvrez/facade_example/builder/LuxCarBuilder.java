package ru.skvrez.facade_example.builder;

import ru.skvrez.facade_example.Car;

public class LuxCarBuilder extends AbstractCarBuilder {

    public LuxCarBuilder(Car car) {
        super(car);
    }

    @Override
    public void setEngine() {
        appendCarDescription("Установлен мотор обычной мощности");
    }

    @Override
    public void buildSaloon() {
        appendCarDescription("Установлен шикарный кожаный салон с деревянными вставками");
    }

    @Override
    public void paintCar() {
        appendCarDescription("Автомобиль покрашен в умопомрачительный цвет");
    }
}
