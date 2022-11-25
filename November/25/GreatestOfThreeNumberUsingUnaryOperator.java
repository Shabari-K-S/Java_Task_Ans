public class GreatestOfThreeNumberUsingUnaryOperator {
    public static void main(String[] args) {
        // Value or Variable declaration
        int a = 10, b = 25, c = 15;
        int sum=a+b+c-1;
        // Logic Is Applied
        while(sum){
            if(a){
                a--;
                sum--;
            }
            if(b){
                b--;
                sum--;
            }
            if(c){
                c--;
                sum--;
            }
        
        }
        if(a)
            System.out.println("A is greater");
        if(b)
            System.out.println("B is greater");
        if(c)
            System.out.println("C is greater");
    }
}
/*
    output:
            
        
        GreatestOfThreeNumberUsingUnaryOperator.java:7: error: incompatible types: int cannot be converted to boolean
        while(sum){
              ^
        GreatestOfThreeNumberUsingUnaryOperator.java:8: error: incompatible types: int cannot be converted to boolean
            if(a){
               ^
        GreatestOfThreeNumberUsingUnaryOperator.java:12: error: incompatible types: int cannot be converted to boolean
            if(b){
               ^
        GreatestOfThreeNumberUsingUnaryOperator.java:16: error: incompatible types: int cannot be converted to boolean
            if(c){
               ^
        GreatestOfThreeNumberUsingUnaryOperator.java:22: error: incompatible types: int cannot be converted to boolean
        if(a)
           ^
        GreatestOfThreeNumberUsingUnaryOperator.java:24: error: incompatible types: int cannot be converted to boolean
        if(b)
           ^
        GreatestOfThreeNumberUsingUnaryOperator.java:26: error: incompatible types: int cannot be converted to boolean
        if(c)
           ^
    
    7 errors


*/



/*

                We can code without using < or > 
    
Try this :

while(sum>0){
            if(a!=0){
                a--;
                sum--;
            }
            if(b!=0){
                b--;
                sum--;
            }
            if(c!=0){
                c--;
                sum--;
            }
        
        }
        if(a!=0)
            System.out.println("A is greater");
        if(b!=0)
            System.out.println("B is greater");
        if(c!=0)
            System.out.println("C is greater");*/




