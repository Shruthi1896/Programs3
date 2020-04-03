package sample;
import java.io.*;

public class Program16 {

	public static void main(String[] args) {
		try {
        Writer w = new FileWriter("D:\\efg.text");  
        String content = "I love my country";  
        w.write(content);  
        w.close();  
        System.out.println("Done");  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  
}  

	}


