package ru.geekbrains.Java2;

public class Human implements IParticipant{
    private int maxLength;
    private int maxHeight;
    private String name;

    public Human(int maxLength, int maxHeight, String name) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name=name;
    }

    public boolean couldOvercome(Object obstacle) {
        if (obstacle instanceof Wall) {
            return jump((Wall)obstacle);
        }
        if (obstacle instanceof Treadmill) {
            return run((Treadmill)obstacle);
        }
        return false;
    }

    private boolean run(Treadmill treadmill) {
        if (this.maxLength >= treadmill.getCharacteristic()) {
            System.out.println(this.name + " пробегает " + treadmill.getCharacteristic() + " метров!");
        }
        else {
            System.out.println(this.name + " не может пробежать " + treadmill.getCharacteristic() + " метров и далее не преодолевает препятствия");
        }
        return this.maxLength >= treadmill.getCharacteristic();
    }
    private boolean jump(Wall wall) {
        if (this.maxLength >= wall.getCharacteristic()) {
            System.out.println(this.name + " перепрыгивает " + wall.getCharacteristic() + " - сантиметровую стену!");
        }
        else {
            System.out.println(this.name + " не может перепрыгнуть " + wall.getCharacteristic()+ " сантиметровую стену и далее не преодолевает препятствия");
        }
        return this.maxLength >= wall.getCharacteristic();
    }
}
