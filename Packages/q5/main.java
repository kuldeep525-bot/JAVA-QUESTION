
import p1.first;
import p1.second;
import p1.third;

 class main {
    public static void main(String st[]) {
        first obj1 = new first();
        second obj2 = new second();
        third obj3 = new third();

        obj1.display();
        System.out.println("access first class variable:"+obj1.x);
        obj2.display();
        obj3.display();
    }
}