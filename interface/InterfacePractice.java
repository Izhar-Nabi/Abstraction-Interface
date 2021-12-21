package Interface;

public interface InterfacePractice {
    public static final int a=10;
    public void Method(); // here We can not show or give the body to the Method because of here default abstract keyword is used...
}
interface interfacePractice2 {
    int b=20;
    public void Method1();
}
class Result implements interfacePractice2,InterfacePractice{
     public void Method(){
    System.out.println("implement of Method one");
    System.out.println(b);
    }
    @Override
     public void Method1(){
    System.out.println("implement of Method two");
    System.out.println(a);
    }
    public static void main(String args[]){
         Result Call = new Result();
         Call.Method();
         Call.Method();

    }
}
