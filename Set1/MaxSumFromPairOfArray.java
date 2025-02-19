import java.util.*;

public class MaxSumFromPairOfArray {
    public static void main(String[] args) {
        int[] arr1 = {2,5,3,4,1,6};
        Arrays.sort(arr1);
        int max=0;
        int sum=0;
        int[] arr=new int[2];
        for(int i=1;i<arr1.length;i++){
            sum=arr1[i]+arr1[i-1];
            if(sum>max){
                max=sum;
                arr[0]=arr1[i-1];
                arr[1]=arr1[i];
            }
        }
        System.out.println(arr[0]+" "+arr[1]);
    }
}
