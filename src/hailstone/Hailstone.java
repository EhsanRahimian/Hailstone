/*
The Hailstone sequence of numbers can be generated from a starting positive integer, n by:

1)If n is 1 then the sequence ends.

2)If n is even then the next n of the sequence = n/2

3)If n is odd then the next n of the sequence = (3 * n) + 1

*/
package hailstone;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Hailstone {
    public static List<Integer>getHailstonSequence(int n){
        
            
        
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            if(n%2==0)
                n=n/2;
            else
                n=3*n+1;
            list.add(n);
        }
        return list;
    }

    
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner MyScanner = new Scanner(System.in);
        int num;
        num = MyScanner.nextInt();
        if(num<=0){ 
             throw new IllegalArgumentException("Invalid starting sequence number");
        }
  
    
        List<Integer>sequence=getHailstonSequence(num);
        System.out.println("Sequence for "+num+" has "+sequence.size()+" elements: "+sequence);
        
    }
    
}
