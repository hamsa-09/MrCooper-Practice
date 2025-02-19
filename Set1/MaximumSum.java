import java.util.*;

public class MaximumSum {
public static void main(String[] args) {
    int arr[]= {1, 4, 2, 10, 23, 3, 1, 0, 20};
    int N=4;
    int max=0;
    for(int i=0;i<N;i++){
        max+=arr[i];
    }

    int slide=max;
    for(int k=0,m=N;m<arr.length;k++,m++){
        slide=slide-arr[k]+arr[m];
        max=Math.max(max,slide);
    }
    System.out.println(max);

}
}
