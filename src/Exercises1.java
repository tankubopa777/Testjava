import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Exercises1 {

    public static <str> void main(String[] args)throws IOException {
        //1
        //Scanner scan5 = new Scanner(System.in);
        //String word1 = scan5.nextLine();
        //String word2 = scan5.nextLine();

        //System.out.println(word1.length() < word2.length() ? word1.length() : word2.length());

        // 2
        Random rand = new Random();
        int n1 = rand.nextInt(100);
        int n2 = rand.nextInt(100);
        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);

        //if(n1 < n2){
        //    System.out.println("number 1 is less than number 2");
        //} else if (n2 < n1) {
        //    System.out.println("number 2 is less than number 1");
        //} else {
        //    System.out.println("number 2 is equal number 1");
        //}

        //3
        //Scanner scan3 = new Scanner(System.in);
        //System.out.print("Enter File name : ");
        //String file = scan3.nextLine();
        //int dot = file.indexOf(".");
        //file = file.substring(dot+1);
        //System.out.println(file+".");

        //4
        //Scanner scan4 = new Scanner(System.in);
        //System.out.print("Quarter = ");
        //double number1 = scan4.nextInt();
        //System.out.print("Dimes = ");
        //double number2 = scan4.nextInt();
        //System.out.print("Nickels = ");
        //double number3 = scan4.nextInt();
        //number1 = number1 * 0.25;
        //number2 = number2 * 0.10;
        //number3 = number3 * 0.05;
        //DecimalFormat dollar = new DecimalFormat(".00$");
        //System.out.println(dollar.format(number1+number2+number3));

        //5
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Radius = ");
        //int radius = scan.nextInt();
        //System.out.print("Area = ");
        //System.out.println(radius * Math.PI);
        //System.out.print("Circumference = ");
        //System.out.println(radius * Math.PI * 2);

        //6
        //Random rand2 = new Random();
        //int y = 100;
        //for (int i = 0; i < 5; i++) {
        //    int x = rand2.nextInt(60,101);
        //    System.out.println(x);
        //    if(x < y){
        //        y = x;
        //    }
        //}
        //System.out.print("The smallest number is ");
        //System.out.println(y);

        //7
        //Random rand3 = new Random();
        //int averange = 0;
        //for (int i = 0; i < 3;i++){
        //    int x = rand3.nextInt(0,51);
        //    System.out.print("Number " + i + " = ");
        //    System.out.println(x);
        //    averange += x;
        //}
        //System.out.println("Average is " + averange/3);

        //10
        //Scanner scan1 = new Scanner(System.in);
        //System.out.print("Password : ");
        //String x = scan1.nextLine();
        //System.out.print("Password same : ");
        //String y = scan1.nextLine();
        //if (x.equals(y) == true){
        //    System.out.println("You are now registered as a new user");
        //} else {
        //    System.out.println("Sorry,there is a typo in your password");
        //}

        //11
        //Scanner scan2 = new Scanner(System.in);
        //String x = scan2.nextLine();
        //int dot = x.indexOf(".");
        //x = x.substring(3,dot);

        //13

//        Scanner in = new Scanner(System.in);
//        int NUM = in.nextInt();
//        for (int i = 0;i < NUM;i++){
//            String dot = "." ;
//            String com = "*" ;
//
//            for (int q = NUM-i ;0 < q;q--) {
//                System.out.print(dot);
//            }
//
//            for (int m = 0;m < i+1;m++) {
//                System.out.print(com);
//
//            }
//
//
//            System.out.println("");
//        }




    }
}

