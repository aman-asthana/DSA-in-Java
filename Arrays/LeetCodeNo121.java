public class LeetCodeNo121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxprofit = Math.max(maxprofit, prices[i] - minPrice);
        }
        return maxprofit;
    }
}
