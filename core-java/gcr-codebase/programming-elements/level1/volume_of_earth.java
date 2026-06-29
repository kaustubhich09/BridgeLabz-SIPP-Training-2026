import java.util.Scanner;
public class volume_of_earth {
    public static void main(String[] args) {
        double radius = 6371.0; 
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Earth: " + volume + " km³");
    }
}
