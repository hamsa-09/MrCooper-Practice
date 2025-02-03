import java.util.*;

public class ReverseString{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String word="";
    String str=s.trim().replaceAll("[^A-Za-z0-9]", "");
    for(int i=str.length()-1;i>=0;i--){
        word+=str.charAt(i);
    }
    System.out.println(word);
}
}
