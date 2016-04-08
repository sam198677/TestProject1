package testproject1test;

public class Factorial {
	public static void main(String[] args){
	int facto = 5;
	System.out.println("The Factorial of " + facto + " is " + fact(facto));
	}
public static int fact(int x){
	int y = 1;
	int i;
	for (i=1;i<=x;i++)
	y = y * i;
	return(y);
}
}
