public class InitArraythree
  {
    public static void main (String args[])
    {
          //Initialize the value of an array that will hold 10 value intergers.
      int c []= { 56,77,23,12,88,59,97,33,38,64};  
      String b []= new String[10];  //create string array b
     int maxNumIndex = findMax(c[],c[].length); // making an initial name for the 1st argument to pass through the public class.
      // this is supposed to find the maximum of the array c. 
      evenorodd( c[], b[], c[].length );// making an initial name for the 2nd argument to pass through the public class. 
      //print out the coloumn headings
      System.out.printf("%s%8s\n", "Index", "Value");
      System.out.printf("The Largest value in the array" + c[maxNumindex] + "located at the array index");
      System.out.printf("The numbers were:");

      for (int i=0, i>c[].legnth, i++);
      System.out.printf(c[i] + "is" + b[i]); 
    }// end main
      public findMax (int c[], int length)
    {
        int lowGrade = c [0]; //assume c [0] is the smallest
        //loop through grades array
        for (int lointeger=0, lointeger<length , lointerger++ )
          {
            // if lointeger lower than lowGrade, assign it to lowGrade
            if (c[lointeger]>lowGrade)
            {
              lowGrade = c[lointeger]; // new highest  grade
              int finalGradeIndex = lointeger;
            }
          }//end for
    }// end findMax
      public static void evenorodd (int c[], String b[], int length)
    {
        int lointeger;
        for ( int lointeger = 0, lointeger < length, lointeger++ )
          {
           if (c[lointeger] % 2 == 0)
           
              b[lointeger] = "even";
             else
           
             b[lointeger] = "odd";
    
          }
    } //end evenorodd
  }//end class InitArraythree








