package SF211Midterm.src.Testjava;
import java.io.*;
import java.util.*;
public class Testmid{
    public static void main(String[] args)throws FileNotFoundException {
        {
            File input = new File("input.txt");
            Scanner file = new Scanner(input);
            double x = 0;
            int y = 0;
            while (file.hasNextDouble()) {
                x += file.nextDouble();
                y++;
            }
            System.out.println(x);
            System.out.println(x/y);
        }

    //}
    // int maxnumber = 0 ;
    // int lessnumber = 100 ;
    // int allnum = 0 ;
    // for (int i = 0 ;i < 10;i++){
    //     Scanner scan = new Scanner(System.in);
    //     int number = scan.nextInt();
    //     if (number < 100 && number > 0){
    //         if (number > maxnumber){
    //             maxnumber = number ;
    //         }
    //         if (number < lessnumber){
    //             lessnumber = number; 
    //         }
    //         allnum += number ;
    //     } else {
    //         System.out.println("Can not use this number");
    //         i = i - 1;
    //     }}
    // System.out.println(maxnumber);
    // System.out.println(lessnumber);
    // System.out.println(allnum/10);

    //  Scanner scan5 = new Scanner(System.in);
    //  int binumber = scan5.nextInt();
    //  String bit = "";
    //  while (binumber > 0){
    //      bit += (char)binumber%2;
    //      binumber /= 2;
    //  }
    //  System.out.println(bit);

    // Scanner in = new Scanner(System.in);
    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     int c = in.nextInt();
    //     int total = 0;

    //     if (a % 2 == 1){
    //         total -= a;
    //     }else{
    //         total += a;
    //     }

    //      if (b % 2 == 1){
    //         total -= b;
    //     }else{
    //         total += b;
    //     }
    //      if (c % 2 == 1){
    //         total -= c;
    //     }else{
    //         total += c;
    //     }

    //     System.out.println(total);


    // Scanner in = new Scanner(System.in);
    //     int s = in.nextInt();
    //     for (int i = 0;i < s;i++){
    //         for (int q = 0;q < s;q++){
    //             System.out.print("+");
    //         }
    //         System.out.print("\n");

    //     }
//    Scanner in = new Scanner(System.in);
//    String a = in.nextLine();
//    String equation = in.nextLine();
//    String b = in.nextLine();
//    int result = 0;
//
//    switch(equation) {
//        case "-":
//            result =  Integer.parseInt(a) - Integer.parseInt(b);
//            break;
//        case "+":
//            result =  Integer.parseInt(a) + Integer.parseInt(b);
//            break;
//        case "x":
//            result =  Integer.parseInt(a) * Integer.parseInt(b);
//            break;
//        case "/":
//            result =  Integer.parseInt(a) / Integer.parseInt(b);
//            break;
//
//    }
//
//    System.out.println(result);
//     }

    
    
}
}
