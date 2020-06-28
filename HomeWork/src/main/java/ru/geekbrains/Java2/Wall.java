package ru.geekbrains.Java2;

public class Wall implements IObstacle {
    private int Characteristic;

    public Wall(int characteristic) {
        Characteristic = characteristic;
    }

    public int getCharacteristic() {
        return Characteristic;
    }
}
