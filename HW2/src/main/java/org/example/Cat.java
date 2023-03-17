package org.example;

public class Cat extends  SportUnit{
    public Cat(String name, int maxRunDistance,int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight, 0);
    }

    @Override
    public void run(Treadmill treadmill) {
        super.run(treadmill);
    }

    @Override
    public void jump(Wall wall) {
        super.jump(wall);
    }
}
