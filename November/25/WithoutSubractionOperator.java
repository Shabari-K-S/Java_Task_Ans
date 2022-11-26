// In this code we are subractiong two number withou using minus(-) operator

public class WithoutSubractionOperator{
	public static void main(String args[]){
		int x=10,y=25;		//    Logic is 
		int z=~x+y+1;		// z = ~(10)+25+1  => -11+25+1 => -11+26 => 15
		System.out.println("The Subraction of two number using - operator = "+ z);
	}
}
