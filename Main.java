import java.util.Scanner;



public class Main {



    Scanner sc = new Scanner(System.in);



    //function to checkPalindrome

    public void checkPalindrome()  {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        Integer a = sc.nextInt();



            int temp = a;              // temp = temporary
            int rev = 0;             // rev = reverse
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp = temp / 10;

            }
            if (a == rev) {
                System.out.println(a + " is a palindrome number");
            } else {
                System.out.println(a + " is not a palindrome number");
            }
        } catch ( Exception e){
            System.out.println("Entered Number is too large ");
            System.out.println( e );
        }


        }



    //function to printPattern

    public void printPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid input number");
        int b = sc.nextInt();

        int i;
        for(i=b;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }



    //function to check no is prime or not

    public void checkPrimeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int c = sc.nextInt();

        int temp = 0;
        int i;
        for(i=2;i<c-1;i++){
            if(c%i==0){
                temp = temp + 1;
            }
        }
        if(temp>0){
            System.out.println("The number is not a prime number ");
        }
        else{
            System.out.println("the number is prime number ");
        }

    }



    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int d = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int i;
        int n3;
        System.out.print("0,1");
        for(i=1;i<d;i++){
            n3 = n1 + n2;
            System.out.print( "," + n3);
            n1 = n2;
            n2 = n3;
        }

    }



//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();



            choice = sc.nextInt();

            switch (choice) {



                case 0:

                    choice = 0;

                    break;



                case 1: {

                    obj.checkPalindrome();

                }

                break;



                case 2: {



                    obj.printPattern();

                }

                break;



                case 3: {

                    obj.checkPrimeNumber();

                }

                break;



                case 4: {



                    obj.printFibonacciSeries();

                }

                break;



                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }



        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }



}