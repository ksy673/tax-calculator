package calc;

public class Calc {
    public static int[] calculateTaxAndCost(int price, String taxRate) {
    	
    	int cost;
    	int tax;
    	double dTaxRate = 0;
    	
    	
        if(taxRate == "8%") {
            dTaxRate = 0.08;
            
         }else if(taxRate == "10%") {
            dTaxRate = 0.1;
            
         }
       // cost = (int) (price/(1+dTaxRate));
       // tax = (int) (cost*dTaxRate);
        
        tax = (int) Math.round(price / (1+dTaxRate) * dTaxRate);
        cost = price - tax;
    	
        int[] answer = { cost, tax }; // 변경해야 하는 부분 0번 인덱스가 cost(원가), 1번 인덱스가 tax(소비세)가 되도록 작성바랍니다.
        return answer;
    }
}
