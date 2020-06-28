package ru.geekbrains.Java2;

public class Treadmill implements IObstacle{
    private int Characteristic;

    public Treadmill(int Characteristic) {
        this.Characteristic = Characteristic;
    }
    public int getCharacteristic() {
        return Characteristic;
    }
}
