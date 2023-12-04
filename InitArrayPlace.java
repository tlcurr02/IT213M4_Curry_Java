//Fig 7.4 InitArrayPlace.java
//Calculating values to be placed into elements of an array

public class InitArrayPlace 
  {

    public static void main (String args[])
    {
         final int ARRAY_LENGTH = 10;             // declare a constant
          int array[]= new int [ ARRAY_LENGTH ];   // create the array that will hold the number declared in array_length.
     
      //calculate value for each arrray element

      // initialize the counter to zero and follow the counter while less than declared constant. With math . length and then counter up by one. 
      for ( int counter = 0; counter  < array.length; counter++)
        array [ counter ] = 2 + 2 * counter;

      

      System.out.printf (%5d%8d\n", counter, array[ counter]);  // Create the colomn headings


      // output each array element's value
      for (int counter = ; counter < array.length; counter++ )
        System.out.printf ("%5d%8d\", counter , array [ counter ] );






      
    }//end main






    
  }//end class InitArrayPlace













  
