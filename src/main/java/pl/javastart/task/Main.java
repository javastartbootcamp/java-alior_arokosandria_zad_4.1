package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(120, 30, true, 100);
        Room room1 = new Room(100.09, 30, true, 100);
        System.out.println(room.lowerTemperature());
        System.out.println(room.getTemperature());
        System.out.println(room1.lowerTemperature());
        System.out.println(room1.getTemperature());
    }
}
