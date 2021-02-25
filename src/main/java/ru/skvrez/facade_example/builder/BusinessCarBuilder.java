package ru.skvrez.facade_example.builder;

import ru.skvrez.facade_example.Car;
import ru.skvrez.facade_example.builder.AbstractCarBuilder;

public class BusinessCarBuilder extends AbstractCarBuilder {

    public BusinessCarBuilder(Car car) {
        super(car);
    }

    @Override
    public void setEngine() {
        appendCarDescription("Установлен мотор обычной мощности");
    }

    @Override
    public void buildSaloon() {
        appendCarDescription("Установлен салон из эко-кожи с пластиковыми вставками под дерево");
    }

    @Override
    public void paintCar() {
        appendCarDescription("Автомобиль покрашен в строгий черный цвет");
    }
}
