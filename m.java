public class m{
    int sum(int x,int y){
        return x+y;
    }
    int sum(int x,int y,int z){
        return x+y+z;

    }
    double sum(double x,double y){
        return x+y;
    }
    public static void main(String args[]){
        m o = new m();
        System.out.println(o.sum(3, 6));
        System.out.println(o.sum(3, 5, 7));
        System.out.println(o.sum(3.6, 4.7));
    }
}