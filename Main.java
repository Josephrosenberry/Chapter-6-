public class Main{
  
    public static void main (String [] args){
        System.out.print("\f");
        String [] words = new String[8];
        words[0] = "Super";
        words[1] = "Friends";
        int sum = 0;
        for ( String s : words){
            if (s != null)
            if  (s.charAt(0) == 'S' || s.charAt(0) == 's');
            sum++;
        }
        
        System.out.println(sum + " words start with s or S");
        sum = 0;
        
        for (String s : words){
            if (s!= null)
                if (s.substring(0,1).equalsIgnoreCase("S"))
                sum++;
            }
       int[] a = {1,2,3,4,5};

          System.out.println(hasNegative(a));
          printArray(a);
          
          swapArray(a);
          
          printArray(a);
          
     
        }
        
        public static boolean hasNegative( int [] n){
          for (int a : n){
          if ( a < 0)
            return true;
          
        }
        return false;
    }
    public static void swapArray(int [] a){
         int k, temp;
      for (k = 0; k < a.length/2; k++){
          temp = a[k];
          a[k] = a[a.length - 1 - k];
          a[a.length - 1 - k] = temp;
     }
    }
    public static void printArray(int [] n){
      
      for (int k = 0; k< n.length; k++){
        System.out.print("[" + n[k] + "]");
        
        
    }
    System.out.println();
    }
}