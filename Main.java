import java.util.Scanner;

public class Main {

    int number;
    Scanner sc = new Scanner(System.in);


    //function to checkPalindrome

    public void checkPalindrome() {
        int r,sum=0,temp;
        int n = number;

        temp = n;
        while(n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }
        if(temp == sum)
            System.out.println("It's a palindrome");
        else
            System.out.println("It's not a palindrome");
    }


    //function to printPattern

    public void printPattern() {
        int rows = number;
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }


    //function to check no is prime or not

    public void checkPrimeNumber() {
        int i,m=0,flag=0;
        int n=number;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        } else {
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }


    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.

        int f1 = 0, f2 = 1, i;

        if (number < 1)
            return;
        System.out.print(f1 + " ");
        for (i = 1; i < number; i++)
        {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
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
                    System.out.println("Enter number: ");
                    obj.number = sc.nextInt();
                    System.out.println();

                    obj.checkPalindrome();

                    System.out.println();

                }
                break;

                case 2: {
                    System.out.println("Enter number: ");
                    obj.number = sc.nextInt();
                    System.out.println();

                    obj.printPattern();
                    System.out.println();

                }
                break;

                case 3: {
                    System.out.println("Enter number: ");
                    obj.number = sc.nextInt();
                    System.out.println();

                    obj.checkPrimeNumber();
                    System.out.println();

                }
                break;

                case 4: {
                    System.out.println("Enter number: ");
                    obj.number = sc.nextInt();
                    System.out.println();

                    obj.printFibonacciSeries();
                    System.out.println();

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
