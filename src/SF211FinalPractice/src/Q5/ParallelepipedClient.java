package SF211FinalPractice.src.Q5;
/* ParallelepipedClient class */

import java.util.Scanner;

public class ParallelepipedClient {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Rectangle r1 = new Rectangle(0, 0);
    Parallelepiped p1 = new Parallelepiped(0, 0, 0);

    System.out.print("Enter an integer for the width > ");
    int w = scan.nextInt();
    System.out.print("Enter an integer for the height > ");
    int h = scan.nextInt();

    Rectangle r2 = new Rectangle(w, h);

    System.out.println("Your rectangle is " + r2);
    if (r1.equals(r2))
      System.out.println("Your rectangle is equal to " + r1);
    else
      System.out.println("Your rectangle is not equal to " + r1);

    System.out.println("Its perimeter is " + r2.perimeter());
    System.out.println("Its area is " + r2.area());

    System.out.println("We will build a parallelepiped from your rectangle");
    System.out.print("Enter an integer for the length > ");
    int l = scan.nextInt();

    Parallelepiped p2 = new Parallelepiped(w, h, l);

    System.out.println("Your paralellepiped is " + p2);
    if (p1.equals(p2))
      System.out.println("Your paralellepiped is equal to " + p1);
    else
      System.out.println("Your paralelepiped is not equal to " + p1);

    System.out.println("Its area is " + p2.area());
    System.out.println("Its volume is " + p2.volume());

    scan.close();
  }
}