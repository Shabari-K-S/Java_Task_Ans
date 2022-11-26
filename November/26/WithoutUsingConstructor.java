class Add{
    int a,b;
    void write(int a, int b){     // Instead of using constructor 
        this.a=a;                 // we use this keyword 
        this.b=b;
    }
    void display(Add A1){
        int sum = A1.a+A1.b;
        System.out.println(sum);
    }
}
public class WithoutUsingConstructor{
    public static void main(String args[]){
        Add add = new Add();
        add.write(5,8);
        add.display(add);
    }
}
