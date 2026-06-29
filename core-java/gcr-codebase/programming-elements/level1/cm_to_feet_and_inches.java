
public class cm_to_feet_and_inches {
    public static void main(String[] args) {
        double centimeters = 150.0;
        double feet = centimeters / 30.48;
        double inches = (feet - Math.floor(feet)) * 12;
        System.out.println(centimeters + " cm = " + Math.floor(feet) + " feet " + inches + " inches");
    }
}
