package ru.skvrez.facade_example;

import ru.skvrez.facade_example.enums.CarEquipmentLevel;
import ru.skvrez.facade_example.enums.CarModel;

public class Car {
    private CarModel model;
    private CarEquipmentLevel equipmentLevel;
    private String description;

    public Car(CarModel model, CarEquipmentLevel equipmentLevel, String description) {
        this.model = model;
        this.equipmentLevel = equipmentLevel;
        this.description = description;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public CarEquipmentLevel getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(CarEquipmentLevel equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", equipmentLevel=" + equipmentLevel +
                ", description='" + description + '\'' +
                '}';
    }
}
