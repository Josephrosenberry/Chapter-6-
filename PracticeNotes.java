public class PracticeNotes{
  
    public static void main (String [] args){
      
        int[] a = {1,2,3,4,5};

          printArray(a);
          
          swapArray(a);
          
          printArray(a);
          
     
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
        
        System.out.println();
    }
    }
}