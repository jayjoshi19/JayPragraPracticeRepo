package jan18.interfacedemo;

public class InterfaceMain {

    public static void main(String[] args) {

        Calculator calculator = new Computer();

        Calculator c1 = new Iphone10();
        c1.calculate();
        Calculator c2 = new Iphone16();
        c2.calculate();
        Calculator c3 = new Computer();
        c3.calculate();

        System.out.println();

        MusicPlayer player1 = new Computer();
        player1.playMusic();
//        MusicPlayer player2 = new Iphone10();
//        player2.playMusic();
//        MusicPlayer player3 = new Iphone16();
//        player3.playMusic();

        System.out.println();

        Camera cam1 = new Iphone10();
        cam1.takePictures();
        Camera cam2 = new Iphone16();
        cam2.takePictures();

        System.out.println();

        Telephone phone1 = new Iphone10();
        phone1.makeCall();
        phone1.receiveCall();
        phone1.sendText();

        Telephone phone2 = new Iphone16();
        phone2.makeCall();
        phone2.receiveCall();
        phone2.sendText();

        System.out.println();

        Clock clock1 = new Iphone10();
        clock1.setAlarm();
        clock1.setTimer();
        clock1.showTime();

        Clock clock2 = new Iphone16();
        clock2.setAlarm();
        clock2.setTimer();
        clock2.showTime();

        Clock clock3 = new Computer();
        clock3.setAlarm();
        clock2.setTimer();
        clock2.showTime();

        System.out.println();

        AIFeatures features = new Iphone16();
        features.drawFromText();
        features.drawFromVoice();
        features.speechToText();


    }
}
