
public class Clock {

    public static void main(String[] args) {

       int getSeconds = add(18, 32, 47);
        System.out.println(getSeconds);
    }

public static int add(int num1, int num2, int num3) {
      int result = 60 * 60 * num1+ 60 * num2+ num3;
      return result;
   }}

