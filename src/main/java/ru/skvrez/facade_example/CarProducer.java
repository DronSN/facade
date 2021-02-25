package ru.skvrez.facade_example;

import ru.skvrez.facade_example.enums.CarEquipmentLevel;
import ru.skvrez.facade_example.enums.CarModel;

public interface CarProducer {
    Car getMyCar(CarModel carModel, CarEquipmentLevel carEquipmentLevel);
}
