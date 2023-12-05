public class InitArraythree
  {
    public static void main (String args[])
    {
          //Initialize the value of an array that will hold 10 value intergers.
      int c []= { 56,77,23,12,88,59,97,33,38,64};  
      String b []= new String[10];  //create string array b
      findMax(); // making an initial name for the 1st argument to pass through the public class.
      // this is supposed to find the maximum of the array c. 
      evenorodd();// making an initial name for the 2nd argument to pass through the public class. 
      //print out the coloumn headings
      System.out.printf("%s%8s\n", "Index", "Value");
    }// end mai
      public findMax ()
    {
        int lowGrade = c [0]; //assume c [0] is the smallest
        //loop through grades array
        for (int lointeger : c )
          {
            // if lointeger lower than lowGrade, assign it to lowGrade
            if (lointeger > lowGrade)
              lowGrade = lointeger; // new highest  grade
          }//end fo
    }// end findMax
      public evenorodd ()
    {
        int lointeger;
        for ( int lointerger : c )
          {
           String evenOdd = (lointeger % 2 == 0) ? "even" : "odd";
          evenOdd = b;
          }//end for
    } //end evenorodd
  }//end class InitArraythree








