package weekFour;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the Number of Floors:");
        int floors = console.nextInt();
        int occupied = 0;
        int rooms = 0;
        for (int i = 1; i <= floors; i++) {
            System.out.println("Enter the Number of rooms on Floor " + i);
            rooms += console.nextInt();
            System.out.println("How Many of the Floor's Rooms are Occupied?");
            occupied += console.nextInt();
        }

        double rate = (double)occupied / (double)rooms;

        System.out.printf("\nFloors: %d", floors);
        System.out.printf("\nRooms: %d", rooms);
        System.out.printf("\nOccupied Rooms: %d", occupied);
        System.out.printf("\nVacant Rooms: %d", (rooms-occupied));
        System.out.printf("\nOccupancy: %f", rate);


    }
}
