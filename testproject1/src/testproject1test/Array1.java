package testproject1test;

public class Array1 {

	public static void main(String[] args) {
     
		int[] a = {10,20,30,40};
     
     System.out.println(a[1] + " " + a[2]);
     for(int b : a)
    	 System.out.println(b);
     int[] x = new int[5];
     x[1] = 10;
     x[4] = 30;
     for(int c : x)
     System.out.println(c);
     int[][] y = new int[4][2];
     int temp = 5;
     for(int i=0;i<4;i++){
    	 for(int j=0;j<2;j++){
    		 y[i][j] = temp;
    		 temp +=10;
    		 }
     }
     
    	 for(int i=0;i<4;i++){
        	 for(int j=0;j<2;j++){
        		 System.out.print(y[i][j] + " ");
        	 }
        	 System.out.println();
     }
	
	}
}
