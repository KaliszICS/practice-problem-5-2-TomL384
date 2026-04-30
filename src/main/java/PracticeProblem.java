/**
 * File Name: 5.2 Array
 * Author: Tom Leung
 * Date Created: April 29, 2026
 * Date Last Edited: April 29, 2026
 */
public class PracticeProblem{
    
	public static void main(String[] args) {
	    
	}
	
	public static int findValue(int i1, int[] arr){
	    int notfound = -1 ;
	    for (int i2 = 0; i2 < arr.length; i2++){
	        if (arr[i2] == i1){
	            notfound = i2;
	            i2 = arr.length;
	        }
	    }
	    return notfound;
    }
    
    
    public static int findThirdValue(String i1, String[] arr){
	    int notfound = -1 ;
	    int t = 0;
	    for (int i2 = 0; i2 < arr.length && t < 3; i2++){
	        if (arr[i2].equals(i1)){
	            t++;
	        }
	        if (t == 3){
	            notfound = i2;
	        }
	    }
	    return notfound;
    }
    
    public static double[] append(double d1, double[] arr){
        double[] arr1 = new double[arr.length+1];
        for(int i1 = 0; i1 < arr.length; i1++){
            arr1[i1] = arr[i1];
        }
        arr1[arr.length] = d1;
        return arr1;
    }


}
