public class Main {
    public static void main(String[] args) {

        // getter & setter
        // acces
        Student student1 = new Student();
        student1.setName("tankubopa");
        student1.setCodename("tann");
        student1.setPassword("0890736011");
        student1.display();


        Rectangle tankub1 = new Rectangle();
        tankub1.setLength(6);
        tankub1.setWidth(9);
        System.out.println(tankub1.getArea());

        Rectangle tankub2 = new Rectangle();
        tankub2.setLength(10);
        tankub2.setWidth(11);
        System.out.println(tankub2.getArea());

        Employee employee1 = new Employee(64107,"Warunporn","Intarachana",200000);
        System.out.println(employee1.toString());


        // Test constructor and toString()
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);  // toString();

        // Test Setters and Getters
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);  // toString();
        System.out.println("id is: " + inv1.getID());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());

        // Test constructor and toString()
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);  // toString()

        // Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);  // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        // Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1);  // toString()

        int[] number = {1,2,3,4,5,};
        System.out.println(number[2]);
    }
}
