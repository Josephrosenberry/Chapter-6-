import java.util.*;
public class PracticeArrayList{

    public static void main (String []args){
        System.out.print("\f");
        ArrayList<Integer> scores = new ArrayList<Integer>();
        getScores(scores);
        System.out.println("Average: " + getAverage(scores));

        
    }
    public static void getScores(ArrayList<Integer> s){
        Scanner scan = new Scanner (System.in);
        int num = 0;
        while (num != -1) {
            System.out.print("Score (-1 to quit): ");
            num = scan.nextInt();
            if (num != -1)
                s.add(num);
        }
    }
        public static double getAverage(ArrayList<Integer> s){
            int min = s.get(0);
            int max = s.get(0);
            for (int n : s)
            {
                if (n > max)
                    max = n;
                if (n < min)
                    min = n;
                }
            for (int i = 0; i < s.size(); ){
                if(s.get(i) ==max)
                    s.remove(i);
                else if (s.get(i) ==min)
                    s.remove(i);
                else
                    i++;
                }
            int sum = 0;
            for (int n : s)
                sum +=n;
                
            if (s.size() > 0)
                return (double)sum/s.size();
            else
                return 0;
            
       
    }
}
