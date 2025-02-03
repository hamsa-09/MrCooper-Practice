import java.util.*;

public class ReverseStringRec {
public static void main(String[] args) {
    String str = "Hello-World";
    str=str.trim().replaceAll("[^A-Za-z0-9]", "");
    reverse(str,str.length()-1);
}
public static String reverse(String str,int len) {
    if(len<0)return "";

    System.out.print(str.charAt(len));
    return reverse(str,len-1);
}
}
