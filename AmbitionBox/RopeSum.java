package AmbitionBox;
import java.util.Arrays;
public class RopeSum {
public static void main(String[] args) {
    int[] rope = {4,3,2,6};
    int sum=connectRopes(rope);
    System.out.println(sum);
}
static int connectRopes(int[] arr){
    int n=arr.length;
    int[] total=new int[n];
    Arrays.sort(arr);
    int sum=arr[0];
    int index=0;
    for(int i=1;i<n;i++){
        sum+=arr[i];
        total[index++]=sum;
    }
    sum=0;
    for(int i:total){
        sum+=i;
    }
    return sum;
}
}
