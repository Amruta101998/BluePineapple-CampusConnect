package com.amruta;

//Find total occurences of each digits(0-9) using function
public class Oct5_Q2 {
    public static void main(String[] args) {
        int n = 456478654;
        for (int i = 0; i < 10; i++) {
            int occur = CountOccurence(n,i);

            if (occur > 0){
                System.out.println(i + " "+"Occured" +" "+ occur + " "+"times");
            }

        }

    }

    static int CountOccurence(int n,int a){
        int count =0;
        while (n > 0){
            //remainder with 10 will give you last digit
           int rem = n%10;
           //a is the digit number to be occured
           if (rem == a){
               count ++;
           }
           //decrement from last digit
           n = n/10;
        }
        return count;
    }
}

/* output
4 Occured 3 times
5 Occured 2 times
6 Occured 2 times
7 Occured 1 times
8 Occured 1 times
 */