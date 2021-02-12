package challenges;

public class reverseInteger {
  public static void main(String[] args) {
    int num = 123456789;
    System.out.println("reversed number of "+num+" is :"+reverse(num));
  }

  private static int reverse(int num){
    int reversed = 0;
    while(num !=0){
      reversed = reversed * 10 + num%10;
      num = num/10;
      if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
        return 0;
      }
    }
    return reversed;
  }
}
