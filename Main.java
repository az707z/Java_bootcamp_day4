void main() {
   /* 1.Write a program that prints the numbers from 1 to 100 such that:
    If the number is a multiple of 3, you need to print "Fizz" instead of that
    number.
            If the number is a multiple of 5, you need to print "Buzz" instead of that
    number.
            If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
    instead of that number.*/
    int number = 1;
    while (number <= 100) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
        number++;
    }
/*
2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox Expected Output: Reverse
string: xof nworb kciuq ehT
*/
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a statment :");
    String statment = input.nextLine();
    for (int i = statment.length() - 1; i >= 0; i--) {
        System.out.print(statment.charAt(i));
    }
/*
3.Write a program to find the factorial value of any number entered
through the keyboard.
*/
    System.out.println("\nEnter a number to know tha factorial : ");
    int number1 =input.nextInt();
    if (number1 < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
    } else {
        int m = 1;
        int total = 1;

        while (m <= number1) {
            total = total * m;
            m++;
        }

        System.out.println(total);
    }


/*
4.Two numbers are entered through the keyboard. Write a program to find
the value of one number raised to the power of another. (Do not use Java
built-in method)
*/
    System.out.println("Pleas Enter The Number :");
    int num2 = input.nextInt();
    System.out.println("Pleas Enter The Power :");
    int power = input.nextInt();
    int i2 = 1;
    for (int i3 = 0; i3 < power; i3++) {
        i2 = i2 * num2;
    }
    System.out.println(i2);



    /*
    5.Write a program that reads a set of integers, and then prints the sum of
the even and odd integers.
     */
    System.out.print("How Many Numbers? ");
    int count = input.nextInt();

    long evenSum = 0;
    long oddSum = 0;

    System.out.println("Enter the numbers:");

    for (int i = 0; i < count; i++) {
        int numb = input.nextInt();

        if (numb % 2 == 0) {
            evenSum += numb;
        } else {
            oddSum += numb;
        }
    }

    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);

    /*
    6.Write a program that prompts the user to input a positive integer. It
should then output a message indicating whether the number is a prime
number.
     */
    System.out.print("Enter a positive integer: ");
    int numbe = input.nextInt();

    boolean isPrime = numbe >= 2;

    for (int divisor = 2; isPrime && divisor <= numbe / divisor; divisor++) {
        if (numbe % divisor == 0) {
            isPrime = false;
        }
    }

    if (isPrime) {
        System.out.println(numbe + " is a prime number.");
    } else {
        System.out.println(numbe + " is not a prime number.");
    }
    /*
    7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
another for loop to print the days (Days 1 -7) for each week.
     */
    for (int week7 = 1; week7 <= 4; week7++) {
        System.out.println("Week " + week7);

        for (int day7 = 1; day7 <= 7; day7++) {
            System.out.println("Day" + day7);
        }
    }
/*
8.Write a program thats check if the word is a palindrome or not. hint: A
string is said to be a palindrome if it is the same if we start reading it from
left to right or right to left.
 */
    System.out.print("Enter a word: ");
    String word = input.next();
    String reversed = "";

    for (int i = word.length() - 1; i >= 0; i--) {
        reversed = reversed + word.charAt(i);
    }

    if (word.equals(reversed)) {
        System.out.println(word + " is a palindrome.");
    } else {
        System.out.println(word + " is not a palindrome.");
    }
}





