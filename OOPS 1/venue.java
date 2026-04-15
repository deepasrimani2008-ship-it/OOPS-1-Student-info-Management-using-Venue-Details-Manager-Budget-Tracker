import java.io.*;
import java.util.*;

class Venue {
    String name;
    String city;
    String type;         
    int capacity;       
    String owner;       

    void display() {
        System.out.println("Venue Name : " + name);
        System.out.println("City Name : " + city);
        System.out.println("Venue Type : " + type);
        System.out.println("Capacity : " + capacity);
        System.out.println("Owner : " + owner);
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Venue v = new Venue();

        System.out.println("Enter the venue details (name,city,type,capacity,owner) separated by commas:");
        String s = sc.nextLine();
        String[] details = s.split(",");

        v.name = details[0];
        v.city = details[1];
        v.type = details[2];
        v.capacity = Integer.parseInt(details[3]);  
        v.owner = details[4];

        v.display();
    }
}