class operations {

    int a=2, b=3;

    void add(){
        System.out.println("Addition is: " + (a+b));
    }

    void sub(){
        System.out.println("Subtraction is: " + (a-b));
    }
}
public class AddnSub {

    
    public static void main(String[] args) {
        
        operations obj = new operations();

        obj.add();
        obj.sub();
    }
}
