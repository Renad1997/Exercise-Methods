import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int password_length =8 ;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double first = input.nextDouble();
        System.out.println("Input the second number: ");
        double second = input.nextDouble();
        System.out.println("Input the third number:");
        double third = input.nextDouble();
        System.out.println("The smallest value is: "+ smallest(first, second, third));



        System.out.println("Enter the number to check:");
        int number = input.nextInt();
        System.out.println(check(number));


        System.out.println("Input a password:");
        String password = input.next();
        if (validPassword(password)){
            System.out.println("Password is valid: " + password);
        }else{
            System.out.println("Password is invalid: " + password);
        }

    }
    /*1 - Write a Java method to find the smallest number among three numbers.
Test Data: Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:
The smallest value is 25.0 */
    public static double smallest(double first, double second, double third){
       return Math.min(Math.min(first,second),third);
    }

    /*2 - Write a Java method that check if the entered number is
negative or positive or zero.*/
    public static String check(int number){
      if (number > 0){
         return "Positive";
      } else if (number < 0) {
          return "Negative";
      }else{
         return "Zero";
      }
    }
    /*3 - Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.*/
    public static boolean validPassword(String password){
    if (password.length() < password_length)
        return false;
    int charcount= 0;
    int numbercount= 0;
    for (int i = 0; i < password.length(); i++){
        char ch = password.charAt(i);
        if(isNumber(ch)){
            numbercount++;
        } else if (isLetter(ch)) {
            charcount++;
        }else{
            return false;
        }
    }
    return (charcount >= 2 && numbercount >= 2);
    }
    public static boolean isNumber(char ch){
    return (ch >= '0' && ch <= '9');
    }
    public static boolean isLetter(char ch){
        ch= Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
}