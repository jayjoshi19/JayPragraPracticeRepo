package jan25.collectionsdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> camerasList = new LinkedList<>();

        camerasList.add("Nikon");
        camerasList.add("Canon");
        camerasList.add("Sony");
        camerasList.add("FujiFilm");
        camerasList.add("Panasonic");

        System.out.println("Size = "+camerasList.size());

        System.out.println("Elements in Linked List : "+camerasList);

    }
}
