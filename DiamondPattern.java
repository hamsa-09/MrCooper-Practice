public class DiamondPattern {
    public static void main(String[] args) {
        int n=3;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            count=i;
            for(int k=1;k<=(2*i)-1;k++){
                if(k<=((2*i)-1)/2){
                    System.out.print(count+" ");
                    count--;
                }
                else{
                    System.out.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            count=i;
            for(int k=1;k<=(2*i)-1;k++){
                if(k<=((2*i)-1)/2){
                    System.out.print(count+" ");
                    count--;
                }
                else{
                    System.out.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }}}
//    1
//  2 1 2
//3 2 1 2 3
//  2 1 2
//     1
