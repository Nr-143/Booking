package KSK;
import java.util.*;
import java.io.*;
import businfo.mybus;
public class Kdetails 
{ 
   int  counts=0 ,arr[]=new int[60],Avail_seats=60, inter=0 ,price=23,seat=60;
   String location[]={"\n1.Erode","\n2.Perundurai","\n3.Avinashi"};
   String Msg1="\t\t\t\t Please wait We are processing your request!!!";
   String Msg2="\n\t\t\tThanks for choosing KSK!\n";
   Scanner get=new Scanner(System.in);
   int board,destination;
  
    public String name;
    public String start,end;
    public int seat_no=0 ,amount;
 
void Seats()
 {
   Random random=new Random();
   int number=random.nextInt(60);
   for(int i=1;i<arr.length;i++)
   {
     if (arr[i]==0 || arr[i]!=number)
     {
       arr[i]=number;
        seat_no=number;
       counts=counts+1;
     }   
      break;
   }
   System.out.println("\n Alloted seat no:"+number);
   
   if(number%2==0)
   {
     System.out.println("Seat Category: Middle seat");
   }
   else if(number%3==0)
   {
     System.out.println("Seat Category:Window seat");
   }
   else
   {
     System.out.println("Seat Category:Asile seat");
   } 
   System.out.println("\n Remaining Available seats:"+(65-counts));
 }

void price()
 {
    for(int i=board;i<=destination;i++)
    {
       inter=inter+1;
    }
   price=price*inter;
   System.out.println("Price $ :"+price);
   amount=price;  
   price=23;
 }

public void KSK_location()
 {
   for(int i=0;i<=2;i++)
    {
       System.out.println(location[i]);
     }
 }

public void msg()
 { 
    System.out.println("\t\t\t\t");
    for(int i=1;i<=100;i++) {System.out.print(".");}
    System.out.println();
    try{
        for(int i=1;i<Msg2.length();i++)
        {
           System.out.print(Msg2.charAt(i));
           Thread.sleep(100);
         }
        }
     catch(Exception e){}
     System.out.println("\t\t Please  select boarding and Destination only on below mentioned locations ");
     for(int i=1;i<=100;i++) {System.out.print(".");}      
     KSK_location();
 }

public void booking()
 {
      System.out.println("\n Enter your name:");
      name=get.next();
      System.out.println("\n Enter your boarding point number:");
      board=get.nextInt();
      System.out.println("\n Enter your Destination number:");
      destination=get.nextInt();
 }  
public   void booking2()
 {
   try{
       for(int i=1;i<Msg1.length();i++)
       {
            System.out.print(Msg1.charAt(i));
            Thread.sleep(80);
       }
       System.out.println();
       for(int i=1;i<=100;i++)
       {
           System.out.print("/");
           Thread.sleep(80);
        }
        System.out.println("\n");
      }

      catch(Exception e) {}
      start=location[board-1];
      end=location[destination-1];
      System.out.println("\n \t\t\t\t BOOKING CONFIRMED");
      System.out.println("\n Passenger name  :"+name);    
      System.out.println("\n Boarding point:"+start);
      System.out.println("\n  Destination point:"+end);
      price();
      Seats();
      System.out.println("\n \t\t\t\tBus Details");
      System.out.println("BUS BOOKED :KSK");
      System.out.println("BUS no : TN54AN5326");
}
   
public void update()
{
 
 try{
   File f =new File("C:\\Users\\user\\OneDrive\\Desktop\\booking\\KSK.txt")  ;
    FileWriter bwriter=new FileWriter(f,true) ;   
    BufferedWriter file=new BufferedWriter(bwriter);
    file.write("\n\n\n\t\t BUS :KSK");
    file.write("\nName of passenger:"+name);
    file.write("\nArrival:"+start);
    file.write("\nDeparture:"+end);
    file.write("\nticket Price:"+amount);
    file.write("\nSeat  no:"+seat_no);
     file.flush();
     file.close();
    System.out.println("Updated...");
}
catch(Exception e)
{}
  System.out.println("\n\n\n Do you want to book anymore tickets from this bus...Press 1");
  int run=get.nextInt();
   if (run==1)
   {
       booking();
       booking2();
       update();
    }
  } 
}
