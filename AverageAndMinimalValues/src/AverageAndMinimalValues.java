/*******************************************************************************
* Name: Feras
* Description: A program that prompts the user to enter 10 double values
* then displays the average value and displays the minimum value
 ******************************************************************************/

public class AverageAndMinimalValues {
    public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner(System.in);//import
        // double userInput = input.nextDouble();
        double[] values = new double[10];
        System.out.println("Enter 10 double values: ");
        
        for(int i = 0; i<10; i++ ){
            values[i] = input.nextDouble();
        }//end for loop
        
        //display the average value and minimum value 
        System.out.println("\tThe average value is " + average(values));
        System.out.println("\tThe minimal value is value is " + min(values));
    }//end main method
    
    public static int average(int[] array){
        int sum =0;
        for(int value : array){
            sum+=value;
        }//end for each loop
        return sum / array.length;
    }//end Int average method
    
    public static double average(double[] array){
        double sum =0.0;
        for(double value : array){
            sum+=value;
        }//end for each loop
        return sum / array.length;
    }//end Double average method
    
    public static double min(double[] array){
        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) min = array[i];
        }//end for loop
        return min;
        
    }//end min mehtod
}//end class    