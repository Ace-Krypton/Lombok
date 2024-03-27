public class Main {
    public static void main(String[] args) {
        CarWithLombok CarWithLombok1 = new CarWithLombok("GLE", "Mercedes", 2020, 350_000, "white", 5);
        CarWithLombok CarWithLombok2 = new CarWithLombok("GLE", "Mercedes", 2020, 200_000, "silver", 3);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.color());
        System.out.println("car1.equals(car2): " + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("car1.hashCode(): " + CarWithLombok1.hashCode());
        System.out.println("car2.hashCode(): " + CarWithLombok2.hashCode());
    }
}
