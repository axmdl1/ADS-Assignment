import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // Main loop to display task menu
        while (!exit) {
            System.out.println("************************************");
            System.out.println("Task 1");
            System.out.println("Task 2");
            System.out.println("Task 3");
            System.out.println("Task 4");
            System.out.println("Task 5");
            System.out.println("Task 6");
            System.out.println("Task 7");
            System.out.println("Task 8");
            System.out.println("Task 9");
            System.out.println("Task 10");
            System.out.println("0. Exit");
            System.out.println("************************************");
            System.out.println("Enter task number: ");
            int choice = sc.nextInt();

            // This block of code checks users input, if users input is 0 it will stop our loop
            if (choice == 0){
                System.out.println("Good bye!");
                break;
            }

            switch (choice){
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    Task3();
                    break;
                case 4:
                    Task4();
                    break;
                case 5:
                    Task5();
                    break;
                case 6:
                    Task6();
                    break;
                case 7:
                    Task7();
                    break;
                case 8:
                    Task8();
                    break;
                case 9:
                    Task9();
                    break;
                case 10:
                    Task10();
                    break;
                default:
                    System.out.println("Please choose between 1 - 10!");
                    break;

            }
        }
    }

    private static void Task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMin(arr);
    }

    private static void Task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers for array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        averageOfArr(n, arr);
    }

    private static void Task3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for task:");
        int n = sc.nextInt();

        isPrime(n);
    }

    private static void Task4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factorial number!");
        int n = sc.nextInt();

        System.out.println("Result: " + factorial(n));
    }

    private static void Task5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n-th fibonacci number:");
        int n = sc.nextInt();
        System.out.println("Result: " + fibonacci(n));
    }

    private static void Task6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter power:");
        int n = sc.nextInt();
        System.out.println("Result: " + toPower(a,n));
    }

    private static void Task7(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter digits for array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseOrder(arr, 0, arr.length - 1);

        System.out.println("Result: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }

    private static void Task8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Result: " + isDigit(s));
    }

    private static void Task9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int n = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int k = sc.nextInt();
        System.out.println("Result: " + binomialCoef(n, k));
    }

    private static void Task10(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();

        System.out.println("Result: " + GCD(a,b));
    }

    private static int GCD(int a, int b){
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }

    private static int binomialCoef(int n, int k){
        if (k == 0 || n == k)
            return 1;

        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static String isDigit(String str){
        if(str.length() == 0)
            return "Yes";

        if (Character.isDigit(str.charAt(0)))
            return isDigit(str.substring(1));
        else
            return "No";
    }

    private static void reverseOrder(int[] arr, int start, int end){
        if (start >= end)
            return;

        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        reverseOrder(arr, start + 1, end - 1);
    }

    private static int toPower(int a, int n){
        if(n == 0)
            return 1;
        else
            return a * toPower(a, n - 1);
    }

    private static int fibonacci(int n){
        if (n <= 1 )
            return n; // F0 = 0 and F1 = 1 base case
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int factorial(int n){
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    private static void isPrime(int n){
        if(n % 2 == 0){
            System.out.println(n + " Composite");
        }
        else {
            System.out.println(n + " Prime");
        }
    }

    private static void averageOfArr(int n, int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / n;
        System.out.println("Result: " + average);
    }


    private static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Result: " + min);
    }
}
