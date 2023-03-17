package org.example;

public class Robot extends SportUnit {
    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
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