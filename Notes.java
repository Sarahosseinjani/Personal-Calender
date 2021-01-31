



import java.util.*;
public class Notes {
  String text;
  String subject;
  String date;
  String hou;
  Scanner sc=new Scanner(System.in);
  
  public Notes(String tex,String sub,String dat,String hour ) {    //constructor of Notes class
	  text=tex;
	  subject=sub;
	  date=dat;
      hou=hour;
  }
  public void print() {                         //method for printing information
	  
	  System.out.println("Text is :"+text);
	  System.out.println("Subject is :"+subject);
	  System.out.println("Date is :"+date);
	  System.out.println("***********************");
  }
   
}



