

public interface Service {
  

 

//  serviceCode.put(engineFixing,);
//  serviceCode.put(clutchFixing,);
//  serviceCode.put(brakeFixing,);
//  serviceCode.put(gearFixing,rr);

   void basicService();
   void engineFixing();
   void clutchFixing();
   void brakeFixing();
   void gearFixing();

   void generateBill();
}
