interface Showable{  
    void show();  
    interface Message{  
     void msg();  
    }  
  }  
  class A implements Showable.Message{  
   public void msg(){System.out.println("Hello nested interface");}  
    
   public static void main(String args[]){  
    Showable.Message message=new A();//upcasting here  
    message.msg();  
   }  
  }  