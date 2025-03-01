class test {
    test() {
        System.out.println("the default constructor is intialized");

    }

    test(int a) {
        System.out.println("the parametrized constructor is intialized with integer value:" + a);
    }

    test(double a) {
        System.out.println("the parametrized constructor is intialized with double value:" + a);
    }

    test(test ob) {
        System.out.println("the copy constructor is intialized with object value:");
    }
}

class constructoroverloading {

    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test(10);
        test t3 = new test(837.7);
        test t4 = new test(t2);

    }
}
