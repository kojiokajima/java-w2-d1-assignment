import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolBarUI;

import java.lang.Math;

public class AreaOfPentagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();

        double side = 2 * length * Math.sin(Math.PI / 5);
        double area = Math.round((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)) * 100.0) / 100.0;

        System.out.println("The area of the pentagon is " + area);
    }
}