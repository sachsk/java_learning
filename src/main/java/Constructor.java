public class Constructor {
    String carModel;
    int carPrice;

    public Constructor(String model, int price) {
        carModel = model;
        carPrice = price;
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor("Tata safari", 2200000);
        System.out.println("Car model is " + constructor.carModel + " And price is " + constructor.carPrice);
    }
}
