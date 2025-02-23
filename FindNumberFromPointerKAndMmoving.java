
public class FindNumberFromPointerKAndMmoving {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    int m=3;
    int k=3;
        m=(k+m)%arr.length;
        System.out.println(arr[m]);

}
}
