
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        //find min length one, to decrease the for loop times.
        if (strs.length == 0) return "";
        int lenMin = strs[0].length();
        int index = 0;
        for(int i = 1; i<strs.length; i++){
            int len = strs[i].length();
        	if (lenMin > len){
            	lenMin = len;
        		index = i;
        	}	
        }
        

        int flag = 0;
        String s = "";
        for (int i= lenMin; i>0;i--){
        	
        	for(int j = 0; j<strs.length;j++){
        		if(!(strs[j].substring(0,i).equalsIgnoreCase(strs[index].substring(0, i)) )){
        			flag = -1;
        			break;
        		}
        	}
        	if (flag == 0){
        		s = (String) strs[index].subSequence(0,i);
        		break;
        	}
        	else{
        		flag = 0;
        	}
	
        }
        return s;
    }
	
	
	


	public static void main(String[] args){
		String[] example = {"aaa","aab"};
		System.out.println(longestCommonPrefix(example));
		
		
	}
}
