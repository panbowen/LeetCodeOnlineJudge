// Reference from http://blog.csdn.net/fightforyourdream/article/details/15026089
/*
 * two o(n) iteration, find out: at each position i, the left and max value, denoted as left[i], it value at i is the most, left[i] = a[i]
 * when calculate the volumn at each postion, find the min between left[i] and right[i] 
 */
public class TrappingRain {
	public static int trap(int[] a) {
		int left = 0;
		int right = 0;
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++){
			if (i == 0 || i == a.length -1)
				sum +=0;
			else{
				left = findMax(a,0,i);
				right = findMax (a,i, a.length -1);
				
				sum += Math.min(left, right) - a[i];
			}
		}
		return sum;
	}
	
	
	 private static int findMax(int a[], int i, int j) {
		 int max = a[i];
		 for (int k = i; k < j+1; k++){
			 max = Math.max(max,a[k]);
		 }
		 
		return max;
	}


	public static int trapDP(int[] A) {  
	        if(A.length == 0){  
	            return 0;  
	        }  
	          
	        int[] left = new int[A.length];  
	        int[] right = new int[A.length];  
	          
	        left[0] = A[0];  
	        for(int i=1; i<A.length; i++){  
	            left[i] = Math.max(left[i-1], A[i]);  
	        }  
	        right[A.length-1] = A[A.length-1];  
	        for(int i=A.length-2; i>=0; i--){  
	            right[i] = Math.max(right[i+1], A[i]);  
	        }  
          
	        int sum = 0;  
	        for(int i=1; i<A.length-1; i++){  
	            sum += Math.min(left[i], right[i]) - A[i];  
	        }  
	          
	        return sum;  
	    }  
	
	public static void main(String[] args){
		int[] A = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(A));
	}


}
