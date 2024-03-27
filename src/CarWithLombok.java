public record CarWithLombok(String model, String brand, int year,
                  int price, String color, int quantity) {
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
