//Fig. 7.3: InitArray.java 
// This is the second method of creating an array
//Initializing the elements of an array with an array initializer.

public class InitArraytwo
  {
    public static void main (String args[])
    {
      //initializer list specifies the value for each element

      int array [] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

      System.out.printf("%s%8s\n", "Index", "Value"); // makes the column headings

      // output each array element's value

      for (int counter = 0;  counter < array.length; counter++ )
        System.out.printf ( "%5d%8d/", counter, array [ counter ] );


      
    }//end main InitArraytwo


    
  }// end class 








