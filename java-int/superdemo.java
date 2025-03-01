
class A {
    int a;
    int b;

    A(int a, int b) {
        this.a = a;
        this.b = b;

    }

}

class B extends A {
    int a;

    B(int a, int b, int c) {
        super(a, b);
        this.a = c;

    }

    public void show() {

        System.out.println("the value of a in super class" + super.a);
        System.out.println("the value of a in this class " + a);

    }

}

class superdemo {

    public static void main(String[] args) {

        System.out.println("this is the program to demonstrate the super keyword");
        B b = new B(10, 11, 12);
        b.show();

    }
}