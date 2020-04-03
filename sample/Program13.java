package sample;
import java.io.ObjectStreamClass;


public class Program13 {

    public static void main(String[] args) {  
  
        ObjectStreamClass osc = ObjectStreamClass.lookup(SmartPhone.class);  
  
        System.out.println("" + osc.getField("price"));  
  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);  
  
        System.out.println("" + osc2.getField("hash"));  
  
    }  
 
	}


