
// Search for the string in a set of integers
// This search could also have been placed in a method.

public class NeedleHaystack
{
    public static void main(String[] args) {
        String [] haystack = {"Learn", "Java", "by", "Examples"};
 
        //
        // Checks to see if the word "Java" is found in the haystack
        // variable.
        //
        String needle = "Java";
        int i=0;
        boolean found = false;    // set the boolean value to false until the key is found
        for ( i = 0; i < haystack.length; i++)
        {
               if (haystack[ i ]  == needle)
              {
                       found = true;      
                       break;
               }
         }

        if (found)   //When found is true, the index of the location of key will be printed.
        {
              System.out.println("Eureka Found " + needle + " at index number " + i + ".");
        }
        else
        {
              System.out.println(needle + "can't find.");
        }
       
        
        
    }
}
        
        
      