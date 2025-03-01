

class deepak {
    void show() {
        System.out.println("the class(1) deepak");

    }
}

class satish extends deepak {

    void show() {
        System.out.println("the class(2) satish");

    }
}

class mukund extends satish {

    void show() {
        System.out.println("the class(3) mukund");

    }
}

class polymorphizm {

    public static void main(String[] args) {
        System.out.println("this program is meant to show the reference variable acceses range(scope) ");

        deepak d = new deepak();
        satish s = new satish();
        mukund m = new mukund();

        deepak v;
        v = d;
        v.show();
        /*
         * v.show1(); make this comment as source to check the error
         * v.show2();
         */
        v = s;
        v.show();
        /*
         * v.show1();
         * v.show2();
         */
        v = m;
        v.show();
        
       
    
    }
}