class A{
    public int a(){
        return 10;
    }
    protected int b(){
        return 10;
    }
    private int c(){
        return 10;
    }
}
public class AccessSpeciferExample{
    public static void main(String args[]){
        A obj=new A();
        System.out.println(""+ obj.a());
        System.out.println(""+ obj.b());
        System.out.println(""+ obj.c());
    }
}
