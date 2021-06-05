/*
 *  UCF COP3330 Summer 2021 Assignment 9 Solution
 *  Copyright 2021 Brandon Powell
 */
/*Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

Example Output

You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints

Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.

 */
import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the length? ");
        String string1 = in.nextLine();
        double length = Double.parseDouble(string1);

        System.out.print("What is the width? ");
        String string2 = in.nextLine();
        double width = Double.parseDouble(string2);

        double sqft = length*width;
        double Paint = Math.ceil(sqft/350);

        System.out.print(String.format("You will need to purchase %.0f gallons of paint to cover %.0f square feet.",Paint,sqft));
    }
}
