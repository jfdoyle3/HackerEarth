import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            int X = Integer.parseInt(br.readLine().trim());
            String[] arr_price = br.readLine().split(" ");
            int[] price = new int[N];
            for(int i_price=0; i_price<arr_price.length; i_price++)
            {
            	price[i_price] = Integer.parseInt(arr_price[i_price]);
            }

            long out_ = getCost(X, k, price, N);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static long getCost(int X, int k, int[] price, int N){
            
        Set<Integer> priceSet=new HashSet<>();

        for(int item : price)
            priceSet.add(item);

        long priceSetSize=priceSet.size()-k;
        long totalPayOut=priceSetSize*X;
        
        if(totalPayOut<0)
            totalPayOut=0;

        return totalPayOut;
    }
}