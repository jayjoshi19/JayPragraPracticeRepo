package jan18.interfacedemo;

public class Iphone10 implements Calculator, Camera, Clock, Telephone, MusicPlayer{


    @Override
    public void calculate() {
        System.out.println("Calculation done using Iphone 10...");
    }

    @Override
    public void takePictures() {
        System.out.println("Pictures taken using Iphone 10...");
    }

    @Override
    public void showTime() {
        System.out.println("Here is the time displayed on Iphone 10...");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm is set using Iphone 10...");
    }

    @Override
    public void setTimer() {
        System.out.println("Stop watch timer is set using Iphone 10...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music for you using Iphone 10...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call for you using Iphone 10...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving incoming call using Iphone 10...");
    }

    @Override
    public void sendText() {
        System.out.println("Sent a text message using Iphone 10...");
    }
}
