package org.example;

public class SportUnit implements Sportsmen{

    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;
    public int contestStatus;

    public SportUnit() {
    }

    public SportUnit(String name, int maxRunDistance, int maxJumpHeight, int contestStatus) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.contestStatus = contestStatus;

    }

    @Override
    public void run(Treadmill treadmill) {
        if (this.contestStatus < 0) return;
        if(treadmill.getSize() <= maxRunDistance){
            System.out.println(this.name + " can run " + treadmill.getSize() + " meters");
            this.contestStatus++;
        }
        else{
            System.out.println(this.name + " can not run " + treadmill.getSize() + " meters");
            this.contestStatus = -1;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (this.contestStatus < 0) return;
        if(maxJumpHeight == 0){
            System.out.println(this.name + " can not jump at all");
            this.contestStatus = -1;
            return;
        }
        if(wall.getSize() <= maxJumpHeight){
            System.out.println(this.name + " can jump " + wall.getSize() + " santimeters");
            this.contestStatus++;
        }
        else{
            System.out.println(this.name + " can not jump " + wall.getSize() + " santimeters");
            this.contestStatus = -1;
        }
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getContestStatus() {
        return contestStatus;
    }
}
