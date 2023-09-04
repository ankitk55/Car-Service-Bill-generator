import java.util.HashMap;

public class Sedan implements Service{
     private  String car ="SEDAN";
     HashMap<String,String>hmm;
     public Sedan(HashMap<String,String>hmm){
          this.hmm =hmm;
     }
    

     HashMap<Integer ,Integer>hm = new HashMap<>();
   

     private int servicePrice =0;
    private boolean basicService;
     private boolean engineFixing;
      private boolean clutchFixing;
       private boolean brakeFixing;
        private boolean gearFixing;

      private int  basicServiceCharge=4000;
       private   int  engineFixingCharge=8000;
        private   int clutchFixingCharge=4000;
        private    int  brakeFixingCharge=1500;
          private   int  gearFixingCharge=6000;

   public void basicService(){
        basicService=true;
        servicePrice+=basicServiceCharge;
   }
  public void engineFixing(){
    engineFixing =true;
    servicePrice+=engineFixingCharge;
   }
  public void clutchFixing(){
    clutchFixing =true;
    servicePrice+=clutchFixingCharge;
   }
    public void brakeFixing(){
    brakeFixing=true;
    servicePrice+=brakeFixingCharge;
   }
   public void gearFixing(){
    gearFixing=true;
    servicePrice+=gearFixingCharge;
   }



  public  void generateBill(){
     StringBuilder sb = new StringBuilder();
     System.out.println("<-----------Service Bill-------->");
     sb.append("\n car type : "+car);

     sb.append("\n Service Code : ");
      if(basicService){
          sb.append(hmm.get("basicService")+",");
      }
       if(engineFixing){
            sb.append(hmm.get("engineFixing")+",");
       }
       if(clutchFixing){
            sb.append(hmm.get("clutchFixing")+",");
       }
       if(brakeFixing){
           sb.append(hmm.get("brakeFixing")+",");
       }
       if(gearFixing){
            sb.append(hmm.get("gearFixing")+",");
       }


     if(basicService){
        sb.append("\n basicServiceCharge  : " +basicServiceCharge);
     }
     if(engineFixing){
         sb.append("\n engineFixingCharge : "+engineFixingCharge);
     }
     if(clutchFixing){
         sb.append("\n clutchFixingCharge : "+clutchFixingCharge);
     }
     if(brakeFixing){
          sb.append("\n brakeFixingCharge : "+brakeFixingCharge);
     }
     if(gearFixing){
          sb.append("\n gearFixingCharge : "+gearFixingCharge);
     }
       sb.append("\n Total payable amount  : "+servicePrice);

       if(servicePrice>10000){
        sb.append("\n Car Cleaning Applicable : YES");
       }
       else{
          sb.append("\n Car Cleaning Applicable : NO");
       }
 
 
         sb.append("\n Thanks for visit  : ");
 
          System.out.println(sb);
    }

}
