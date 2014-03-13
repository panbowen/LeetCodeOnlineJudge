
public class ReverseInteger {
	
	//naive to string reverse
	public static int reverse(int x) {
        int sign = 0;
        if (x < 0) 
        	sign = -1; 
        else
        	sign = 1;
  
        String s = Integer.toString(Math.abs(x));
        StringBuffer s1 = new StringBuffer();
        
        for (int i = 0; i < s.length(); i++){
            s1.append(s.charAt(s.length() - i -1));
        }
        int result = Integer.parseInt(s1.toString());
        
       
        return sign == 1 ? result : result * -1;
    }
	
	public static int reverse2(int x){
		int temp = 0;
		while(x != 0){
			temp = temp * 10 + x % 10;
			
			x /= 10;
		}
		return temp;
	}
	
	public static int reverse3(int x){
		
		
		return reverse3(x/10);
	}
	
	public static void main (String[] args){
		int a = -123;
		System.out.println(reverse2(a));
	}
}
