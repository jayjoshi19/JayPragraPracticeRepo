package jan18.interfacedemo;

public class Iphone16 implements MusicPlayer, Camera, Calculator, Telephone, Clock, AIFeatures{
    @Override
    public void speechToText() {
        System.out.println("Converting speech to text using Iphone 16...");
    }

    @Override
    public void drawFromVoice() {
        System.out.println("Drawing image from your voice using Iphone 16...");
    }

    @Override
    public void drawFromText() {
        System.out.println("Drawing image from the text written using Iphone 16...");
    }

    @Override
    public void calculate() {
        System.out.println("Calculation done using Iphone 16...");
    }

    @Override
    public void takePictures() {
        System.out.println("Pictures taken using Iphone 16...");
    }

    @Override
    public void showTime() {
        System.out.println("Here is the time displayed on Iphone 16...");
    }

    @Override
    public void setAlarm() {
        System.out.println("Alarm is set using Iphone 16...");
    }

    @Override
    public void setTimer() {
        System.out.println("Stop watch timer is set using Iphone 16...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music for you using Iphone 16...");
    }

    @Override
    public void makeCall() {
        System.out.println("Making call for you using Iphone 16...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving incoming call using Iphone 16...");
    }

    @Override
    public void sendText() {
        System.out.println("Sent a text message using Iphone 16...");
    }
}
