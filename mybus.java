package businfo;
public class mybus
{ 
   String Msg1="\n \t\t\t\t OUR TRANSPORTATION SERVICE BUSES";
   String arr[]={"\n\t1.SRM TRANSPORTATION","\n\t2.RAMANI TRANSPORTATION",
                  "\n\t3.KSK TRANSPORTATION"};
   String location[]={". salem",". Erode",". Perundurai",". Avinashi",". Karumathampatty"
                     ,". Coimbatore"};
    
  public void bus_display()
   {
try{
     System.out.println("");
     for (int i=0;i<=Msg1.length();i++)
     {
       
       System.out.print(Msg1.charAt(i));
       Thread.sleep(100);
     } 
    
    
   }catch(Exception e){}
bus();
 }
   void bus(){
        for(int i=0;i<arr.length;i++)
   {
      System.out.println(arr[i]);
   }
    }
     public void location_display()
    { 
       for(int i=0;i<=5;i++)
        {
          System.out.println("\n\t"+location[i]);
       }
    }
}

