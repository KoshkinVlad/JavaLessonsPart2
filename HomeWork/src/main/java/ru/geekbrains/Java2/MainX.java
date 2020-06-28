package ru.geekbrains.Java2;

public class MainX {
    public static void main(String[] args) {
//        участники
        Human Jack = new Human(4000, 80, "Джек");
        Human Kate = new Human(5000, 90, "Кейт");
        Cat Steve = new Cat(15000, 50, "Стив");
        Cat Gordon = new Cat(10000, 65, "Гордон");
        Robot R2D2 = new Robot(1000, 5, "R2D2");
        Robot C3PO = new Robot(1500, 10, "C3PO");
        IParticipant[] participants = {Jack, Kate, Steve, Gordon, R2D2, C3PO};
//        препятствия
        Treadmill smallMill = new Treadmill(500);
        Treadmill mediumMill = new Treadmill(1500);
        Treadmill largeMill = new Treadmill(5000);
        Treadmill extremelyMill = new Treadmill(10000);
        Treadmill impossibleMill = new Treadmill(20000);
        Wall smallWall = new Wall(3);
        Wall mediumWall = new Wall(50);
        Wall largeWall = new Wall(80);
        Wall impossibleWall = new Wall(100);
        IObstacle[] obstacles = {smallMill, smallWall, mediumMill, mediumWall, largeMill, largeWall, extremelyMill, impossibleMill, impossibleWall};
        for(IParticipant partisipant : participants) {
            for(IObstacle obstacle : obstacles) {
                boolean temp = partisipant.couldOvercome(obstacle);
                if (!temp) break;
            }
        }
    }
}
