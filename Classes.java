class Student {

    int id = 1;
    String name = "Prateek";

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println("Function is called! ");
    }
}
public class Classes  {
    
    public static void main (String[] args){

        Student obj = new Student();
        obj.display();
    }
}