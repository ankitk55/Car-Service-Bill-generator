import java.util.*;
public class Main{

     
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

         HashMap<String ,String>hm = new HashMap<>();
        hm.put("basicService","BS01");
         hm.put("engineFixing","EF01");
          hm.put("clutchFixing","CF01");
           hm.put("gearFixing","GF01");
            hm.put("brakeFixing","BF01");

             Service hatchBack =null;
                        Service sedan =null;
                        Service xuv =null;
                        boolean hatchBackFlag =false;
                        boolean sedanFlag =false;
                        boolean xuvFlag =true;
            while(true){
                    System.out.println("enter key for choose your car");
                    System.out.println("press 1 for HATCHBACK  ");
                    System.out.println("press 2 for SEDAN  ");
                    System.out.println("press 3 for XUV  ");
                      int p =sc.nextInt();
                       
                      if(p==1){
                              hatchBack = new HatchBack(hm);
                              hatchBackFlag =true;
                              break;
                      }
                      else if(p==2){
                        sedan = new Sedan(hm);
                          sedanFlag =true;
                          break;
                      }
                      else if(p==3){
                        xuv  =new XUV(hm);
                        xuvFlag=true;
                        break;
                      }
                      else{
                        System.out.println("please enter valid car");
                      }

                    }

      Service car =null;
     if(hatchBackFlag){
car =hatchBack;
     }
     else if(sedanFlag){
        car =sedan;
     }
     else if(xuvFlag){
        car =xuv;
     }

System.out.println("enter key for choose service");
System.out.println("press 1 for basic Service");
System.out.println("press 2 for brake Fixing");
System.out.println("press 3 for clutch Fixing");
System.out.println("press 4 for engine Fixing");
System.out.println("press 5 for gear Fixing");
System.out.println("press 6 for generate  service bill");
System.out.println("press 7 for exit ");


            int countKey1=0;
              int countKey2=0;
                int countKey3=0;
                  int countKey4=0;
                    int countKey5=0;
      
        while(true){
            int key =sc.nextInt();
            if(key==1){
              countKey1++;
              if(countKey1==1){
                 car.basicService();
              }
        else {
            System.out.println("You have already added this service");
        }
            }
           else if(key==2){
            countKey2++;

            if(countKey2==1)
        car.brakeFixing();
        else
          System.out.println("You have already added this service");
            }

            else if(key==3){
                countKey3++;

                if(countKey3==1)
        car.clutchFixing();
                else
                  System.out.println("You have already added this service");
            }
            else if(key==4){
                countKey4++;

                if(countKey4==1)
        car.engineFixing();
        else 
          System.out.println("You have already added this service");
            }
            else if(key==5){
                countKey5++;
                if(countKey5==1)
        car.gearFixing();
        else  System.out.println("You have already added this service");

            }
            else if(key ==6){
                 BillGenerator billGenerator =new BillGenerator();
        billGenerator.setCarService(car);
       billGenerator.generateBillOfCar();
            }
            else if(key==7){
                System.out.println("All operations cancelled ");
                break;
            }
            else {
                System.out.println("wrong key type again");
            }
        }
    }
}