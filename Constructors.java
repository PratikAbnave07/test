
public class Constructors {

    int id,a,b;
    String name;
    String location;

    //Default Construcor
    Constructors(){ 
        System.out.println("Default Constructor is Created!");
    }

    // Parameterised Constructor
    Constructors(int id, String name, String location){

        this.id = id;
        this.name = name;
        this.location = location;      
        System.out.println("Id is: " + id);
        System.out.println("Name is: " + name);
        System.out.println("Location is: " + location);

    }

    // Parameterised Constructor
    Constructors(int id){
        this.id = id;
        System.out.println("Id is: " + id);
    }

    // Copy Constructor

    Constructors(int a, int b){
        this.a = a;
        this.b = b;
    }
    Constructors(Constructors c) {
        this.a = c.a;
        this.b = c.b;
    }
    public static void main(String[] args) {

        //Default
        Constructors c1 = new Constructors();

        // Parameterised
        Constructors c2 = new Constructors(21, "Pratik", "Pune");
        Constructors c3 = new Constructors(23, "Anurag", "Latur");
        Constructors c4 = new Constructors(24);

        // Copy
        Constructors add = new Constructors(10,20);
        Constructors c6 = new Constructors(add);
        System.out.println(c6.a+c6.b);
        
    }
}
