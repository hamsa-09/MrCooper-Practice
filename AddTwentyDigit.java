import java.math.BigInteger;

public class AddTwentyDigit {
 public static void main(String[] args) {
    String s1="12345678901234567890";
    String s2="12345678901234567890";
    BigInteger n1=new BigInteger(s1);
    BigInteger n2=new BigInteger(s2);
    System.out.println(n1.add(n2));
 }
}
