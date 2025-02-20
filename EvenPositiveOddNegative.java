import java.util.*;

public class EvenPositiveOddNegative {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0 && i%2==1){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<0 && j%2==0){
                        swap(arr,i,j);
                        break;
                    }
                }
            }
            else if(arr[i]<0 && i%2==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>=0 && j%2==1){
                        swap(arr,i,j);
                        break;
                    }
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
