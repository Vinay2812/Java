package maths;
import java.util.*;

public class StatisticalOperation{
    public double mean(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];

        return (sum/ arr.length);
    }
    public double median(int []arr){
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            return (arr[n/2] + arr[n/2+1])/2.0;
        }
        else{
            return arr[(n+1)/2];
        }
    }
    public double standardDeviation(int []arr){
        int meanAns=(int)mean(arr);
        long ans=0;
        int square;
        for(int i=0;i<arr.length;i++){
            square=(arr[i]-meanAns)*(arr[i]-meanAns);
            ans+=square;
        }

        double res= Math.sqrt(ans/arr.length);
        return res;

    }

}