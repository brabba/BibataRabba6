/*
*My name is Bibata Rabba and this is my own work
*/
import java.util.*;

public class palindrome {

    public static void main(String[] args) {

        for(int i = 1; i<100001; i++){      //Loop up to 100,000
            if(isPrime(i) && isPalin(i)){       //If a number is both Prime and Palindrome
                System.out.print(i + "\n");
            }
        }
    
    }

    public static boolean isPrime(int x){

        int i = 0;
        int count = 0;

        double sq = 0.0;

        if(x==1){
            return false;
        }
        if(x==2){
            return true;
        }
        
        if(x%2==0){         //If divisible by 2 then it's not Prime
            return false;
        }

        double myDouble = (double) x;

        sq = java.lang.Math.sqrt(myDouble);

        for(i=2;i<=sq;i++){         //If divisible by anything up to the number's square root then it's not prime
            if(x%i==0) return false;
        }

      return true;      //Return true if the number is Prime

    }

    public static boolean isPalin(int x){

        char[] word = ("" + x).toCharArray();   //convert the number into a string and then into a character array
        int i1 = 0;         //First index for the front of the array
        int i2 = word.length - 1;      //Second index for the back of the array
        while (i2 > i1) {       //Loop through both sides and stop in the middle
          if (word[i1] != word[i2]) {       //If the digits are not equal
              return false;                     //It is NOT a palindrome
          }
            i1 = i1 + 1;            //Keep
            i2 = i2 - 1;                //Looping
        }
    
        return true;       //Return true if it is a palindrome

    }

}
