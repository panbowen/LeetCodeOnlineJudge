
public class ReverseWords {
	public static String reverseWords(String s) {
        int len = s.length();
		if (len == 0 || len == 1) return s;
		
		String[] temp = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = temp.length -1; i>=0 ; i--){
			if(!temp[i].equals(""))
				sb.append(temp[i]).append(" ");
		}
		
        return sb.length() == 0? "":sb.substring(0, sb.length()-1);
        
    }
	public static void main(String[] args){
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
}
