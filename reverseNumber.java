import java.util.Scanner;
class reverseNumber {
    public static void Reverse(int number) {
        boolean isNegative = number < 0 ? true : false; 
        if(isNegative){ number = number * -1; } 
        int reverse = 0; int lastDigit = 0; while (number >= 1) { lastDigit = number % 10; 
            // gives you last digit 
            reverse = reverse * 10 + lastDigit; 
            number = number / 10;
        
            }
        if (isNegative) {System.out.println((reverse)+"-");
        }

        else {

            // print the unit digit of the given number
            System.out.print(reverse);

        }


    }
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number you wish to reverse");
        int number = myObj.nextInt();
        System.out.print("Reverse ("+number+") prints ");
        
        Reverse(number);
    }
}
