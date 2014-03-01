
public class StockBuySell1 {
	public static int maxProfit(int[] prices) {
		if(prices.length<1)
		return 0;
		
		int min = prices[0];
		int maxProfit = 0;
		int tempProfit = 0;

		for(int i = 0; i< prices.length;i++){
			if(prices[i]< min) min = prices[i];
			
			tempProfit = prices[i] - min;
			
			if(tempProfit > maxProfit) maxProfit = tempProfit;
			
		}
		return maxProfit > 0 ? maxProfit: 0;        
    }
	
	public static void main(String[] args){
		int[] example = {1,2,3,7,6,7,8,8};
		System.out.println("The max Profit is " + maxProfit(example));
	}

}
