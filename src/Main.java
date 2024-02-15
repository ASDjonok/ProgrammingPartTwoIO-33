public class Main {

    public static void main(String[] args) throws InterruptedException {
        B instanceB = new B();
        System.out.println(instanceB.b);
        System.out.println(instanceB);
        System.out.println(instanceB.a);
//        System.out.println(.staticA);
        System.out.println(instanceB.getClass().getFields());

        /*System.out.println(0/0);
        System.out.println("Hello world!");
        int a = 123;
        int[] array = {1, 2, 3};
        String s = "ASD";
        System.out.println(array.toString());
        s.wait();
        array.wait();*/
    }
}



class A {
    public int a = 1;
    static int aStatic = 2;
}

class B extends A {
    public int b = super.a;
}
