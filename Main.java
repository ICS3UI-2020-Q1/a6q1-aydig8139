import java.util.Scanner;

/**
 * calculates the average of heights
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user how many heights they want to enter and declare a a variable to store that number
    System.out.println("How many heights would you like to enter");
    int numHeights = input.nextInt();
    
    //create an array to store the heights
    int[] heights = new int[numHeights];

    //ask user for the heights
    System.out.println("Please enter the heights on separate lines");

    //use a for loop to get all the heights from the user
    for (int i = 0; i < numHeights; i++){
      
      //fill the array with a value
      heights[i] = input.nextInt();
    }

    //create a variable to store the sum of the heights
    int totalHeights = 0;

    //use a for loop to add each value to the total height
    for(int i = 0; i < numHeights; i++){

      //add each height to the total
      totalHeights = totalHeights + heights[i];
    }

    //calculate the average
    int average = totalHeights/numHeights;

    //tell user the average
    System.out.println("The average height is " + average);

    //print out the heights that are above average
    System.out.println("The heights above average are");

    //create a for loop to determine the heights above average and print them out
    for(int i = 0; i < numHeights; i++){
      
      //write an if statement to print out the height if it is above average
      if (heights[i] > average){
        System.out.println(heights[i]);
      }
    }

    
  }
}
