package carros;

public class Main {


    public static void main(String[] args) {
     Car car = new Car();
     Car car2 = new Car();
     Car car3 = new Car();
     
     car.setCompany_name("Chevrolet");
     car.setModel_name("Cruze");
     car.setYear(2009);
     car.setMileage(250000);
     
     car2.setCompany_name("Mazda");
     car2.setModel_name("RX7");
     car2.setYear(2007);
     car2.setMileage(300000);
     
     
     car3.setCompany_name("BMW");
     car3.setModel_name("E46");
     car3.setYear(2006);
     car3.setMileage(200000);
       
     System.out.println("Company name: " + car.getCompany_name());
     System.out.println("Model name: " + car.getModel_name());
     System.out.println("Year: " + car.getYear());
     System.out.println("mileage: " + car.getMileage() + " millas");
     
     System.out.println("===============================");
     
     System.out.println("Company name: " + car2.getCompany_name());
     System.out.println("Model name: " + car2.getModel_name());
     System.out.println("Year: " + car2.getYear());
     System.out.println("mileage: " + car2.getMileage() + " millas");
     
     System.out.println("================================");
     
     System.out.println("Company name: " + car3.getCompany_name());
     System.out.println("Model name: " + car3.getModel_name());
     System.out.println("Year: " + car3.getYear());
     System.out.println("mileage: " + car3.getMileage() + " millas");
    }
    
}
