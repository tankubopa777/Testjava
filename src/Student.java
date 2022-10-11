public class Student {
    private String name;
    private String codename;
    private String password;
    //getter & setter software pattern
    //accessor & mutator software pattern
    public void setName(String name) {
        this.name = name;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.codename);
        System.out.println(this.password);
    }
}
//bottle --> bottle of water
//headphone --> Razer headphone
//telephone --> iphone
//fruit --> orange
//television --> samsung television

//