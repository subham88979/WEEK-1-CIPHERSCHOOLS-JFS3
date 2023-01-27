public class InheritanceProg1 {
    int width;
    int height;
    void display(String item){
        System.out.println(item +"Width "+width+"Height "+ height);
    }
    public static void main(String args[]){
        Chair neelkamal=new Chair();
        neelkamal.foo();
        Table neelkamal1=new Table();
        neelkamal1.foo();
        Almira goodrej=new Almira();
        goodrej.foo();
    }
}
class Chair extends InheritanceProg1{
    void foo() {width=10;height=20;display("Chair");}
}
class Table extends InheritanceProg1{
    void foo() {width=30;height=50;display("Table");}
}
class Almira extends InheritanceProg1{
    void foo() {width=100;height=200;display("almira");}
}