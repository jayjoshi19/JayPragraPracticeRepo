package jan18.interfacedemo;

// consider this computer as from the 2000s era, with no camera and calling features
public class Computer implements MusicPlayer, Calculator, Clock {
    @Override
    public void calculate() {
        System.out.println("Calculation done using the Computer...");
    }

    @Override
    public void showTime() {
        System.out.println("Here is the time displayed on the Computer...");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm is set using the Computer...");
    }

    @Override
    public void setTimer() {
        System.out.println("Stop watch timer is set using the Computer...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music for you using the Computer...");
    }
}
