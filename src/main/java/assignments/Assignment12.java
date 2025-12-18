package assignments;

public class Assignment12 {

	public static void main(String[] args) {
		
		int[] prices = {7,1,5,3,6,4};
		int maxProfit = 0;
		int buyDay = 0;
		int sellingDay =0;
		
	// Iterating i as buying day	
		for(int i=0;i<prices.length-1;i++) {
			
			//Iterating j as selling day
			for(int j=i+1;j<prices.length;j++) {
				
				int profit= prices[j] - prices[i];
				
				if(maxProfit<profit) {
				maxProfit=profit;
				
				 buyDay = i + 1;
                 sellingDay = j + 1;
				}
				
			}
			
		}
		if (maxProfit > 0) {
            // If there is profit, print the max profit and the days to buy/sell
            System.out.println(" maxProfit is " + maxProfit);
            System.out.println("Buy the share on day " + buyDay);
            System.out.println("Sell the share on day " + sellingDay);
        } else {
            // If there is no profit
            System.out.println("You will lose your money, don't buy this share");
        }

    }


	}


