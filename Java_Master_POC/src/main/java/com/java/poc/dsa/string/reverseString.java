package challenges;

public class reverseString {
  public static void main(String[] args) {
    String txt = "hello world";
    System.out.println("original String is : "+txt);
    reverse(txt);
  }

  private static void reverse(String txt){
    char[] charArray = txt.toCharArray();
    System.out.print("reversed String is : ");
    for(int i = charArray.length - 1; i>=0;i--){
      System.out.print(charArray[i]);
    }
  }
}
