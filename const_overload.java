public class const_overload {  
    int id;  
    String name;  
    const_overload(){  
    System.out.println("this a default constructor");  
    } 
    const_overload(int i, String n){  
    id = i;  
    name = n;  
    }  
    public static void main(String[] args) {  
    const_overload s = new const_overload();  
    System.out.println("\nDefault Constructor values: \n");  
    System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
    System.out.println("\nParameterized Constructor values: \n");  
    const_overload student = new const_overload(10, "David");  
    System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
    }
}  