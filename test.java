public class test{
    public void qwe(){
        System.out.println("Obj garbage is collected");

    }
    public static void main(String args[]){
        test s1 = new test();
        test s2 = new test();
        s1 = null;
        s2 = null;
        System.gc();
    }

}