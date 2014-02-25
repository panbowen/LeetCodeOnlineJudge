import java.util.ArrayList;
import java.util.Arrays;


public class SubsetI {

	public static ArrayList<ArrayList<Integer>> subsetsWithDistinct(int[] s) {
	       if(s== null) return null;
			Arrays.sort(s);
			
			ArrayList<ArrayList<Integer>> subset = new ArrayList<ArrayList<Integer>>();
			
			for(int i =0; i< s.length; i++){
				ArrayList<Integer> tempNum = new ArrayList<Integer>();
				tempNum.add(s[i]);
				
				ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();//copy the result 2-D arraylist
				for (ArrayList<Integer> a : subset) {
					temp.add(new ArrayList<Integer>(a));
				}
				
				for(ArrayList<Integer> sth: temp) sth.add(s[i]);// Subsets-Of (A) = Subsets-Of (B) + ({a} + Subsets-Of (B))
				
				temp.add(tempNum);
				subset.addAll(temp);
			}
			
			subset.add(new ArrayList<Integer>());
			
			return subset;
	    }
	
	public static void main(String[] args){
		int[] number = {1,2};
		ArrayList<ArrayList<Integer>> example = subsetsWithDistinct(number);
		
		for(ArrayList<Integer> sth : example){
			for (int i = 0; i < sth.size(); i++){
				System.out.print(sth.get(i)+ ",");
			}
			System.out.println("");
		}
			
	}
}
