// In this Code we found the answer for division and modules

// without using division and modules opeator

import java.util.Scanner;

class WithoutUsingDivisionOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the valu of a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        int d=0;
        while(true){
            if (a<b){
                break;
            }
            a-=b;
            d++;
        }
        System.out.println("The Division of two number is "+ d);
        System.out.println("The reminder of two number is "+ a);

    }
}
