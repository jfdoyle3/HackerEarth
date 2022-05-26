import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases =Integer.parseInt(br.readLine()); 

        for(int tests=0; tests<testCases; tests++){

            long N = Long.parseLong(br.readLine());
            long k = Long.parseLong(br.readLine());
            long X = Long.parseLong(br.readLine());
            String prices=br.readLine();

            calculateCost(N,k,X,prices);

        }
    }
    public static void calculateCost(long N, long k, long X, String prices){

            String[] priceArr=prices.split(" ");

            Set<Long> priceSet=new HashSet<>();

            for(String price : priceArr)
                priceSet.add(Long.parseLong(price));

            long priceSetSize=priceSet.size();
            long pricesUnknown=priceSetSize-k;
            long totalPayOut=pricesUnknown*X;

            System.out.println(totalPayOut);
    }
}