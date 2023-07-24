import  businfo.mybus;
import SRM.Sdetails;
import RAMANI.Rdetails;
import KSK.Kdetails;
import java .io.*;
import java .util.*;
class main
{
public static void main(String []args)
{  
  String Msg="\n \n \t \t \t \t!!! NR TRANSPORTATION !!!";
  String  Msg2="\n \t \t \t \t\t\t  -HEARTY WELCOME";
  String Msg3="\n\t\t\t\t AVAILABLITY LOACTIONS";
  Scanner get=new Scanner(System.in);
  boolean running=true;
  while(running==true)
  {
   try{
      for (int i=1;i<Msg.length();i++)
      {
        Thread.sleep(80);
        System.out.print(Msg.charAt(i));
      }
      System.out.println();

      for(int i=1;i<Msg2.length();i++)
      {
        Thread.sleep(80);
        System.out.print(Msg2.charAt(i));
      } 
                                        // DISPLAYING BUS DETAILS
      mybus b1=new mybus();
      b1.bus_display();
     
    System.out.println();                  // DISPLAYING LOCATIONS
    for(int i=1;i<Msg3.length();i++)
    {       
       System.out.print(Msg3.charAt(i));
       Thread.sleep(80);
    }

    b1.location_display();
    System.out.println("\nDo you want to CONTINUE BOOKING...Press 1 :");
    int choice1=get.nextInt(); 
    while (choice1==1)
    {
        System.out.println("\nEnter your selected bus no:");
        int choice2=get.nextInt();
        if(choice2==1)
        {
          Sdetails d1=new Sdetails();
          d1.msg();
          d1.booking();
          d1.booking2();
          d1.update();
         
        }

        else if(choice2==2)
        {
             Rdetails d2=new Rdetails();
             d2.msg();
             d2.booking();
             d2.booking2();
             d2.update();
        }

        else if(choice2==3)
        {
            Kdetails  d3=new Kdetails();
            d3.msg();
            d3.booking();
            d3.booking2();
            d3.update();
        }

        else
        {
            System.out.println("Selected bus  is not available");
        }
       
      }
     
   }
   catch(Exception e){}
   running=false;
  } 
 }
}