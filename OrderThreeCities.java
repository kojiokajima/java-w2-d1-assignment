import java.util.Scanner;

public class OrderThreeCities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String first = "", second = "", third = "";

        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();
        
        String lowFirstCity = firstCity.toLowerCase();
        String lowSecondCity = secondCity.toLowerCase();
        String lowThirdCity = thirdCity.toLowerCase();

        if(lowFirstCity.compareTo(lowSecondCity) <= 0 && lowFirstCity.compareTo(lowThirdCity) <= 0) {
            first = firstCity;
            if(lowSecondCity.compareTo(lowThirdCity) <= 0) {
                second = secondCity; 
                third = thirdCity;
            } else {
                second = thirdCity; 
                third = secondCity;
            }
        } else if(lowSecondCity.compareTo(lowFirstCity) <= 0 && lowSecondCity.compareTo(lowThirdCity) <= 0) {
            first = secondCity;
            if(lowFirstCity.compareTo(lowThirdCity) <= 0) {
                second = firstCity; 
                third = thirdCity;
            } else {
                second = thirdCity; 
                third = firstCity;
            }
        } else if(lowThirdCity.compareTo(lowFirstCity) <= 0 && lowThirdCity.compareTo(lowSecondCity) <= 0) {
            first = thirdCity;
            if(lowFirstCity.compareTo(lowSecondCity) <= 0) {
                second = firstCity; 
                third = secondCity;
            } else {
                second = secondCity; 
                third = firstCity;
            }
        }

        System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);

    }
}