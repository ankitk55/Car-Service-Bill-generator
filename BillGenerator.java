public class BillGenerator {
    private Service carService;

    public void setCarService(Service carService){this.carService =carService;}
    public void generateBillOfCar(){carService.generateBill();}

    
}
