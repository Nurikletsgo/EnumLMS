public enum TransportType {
    CAR(0.1),
    BUS(0.5),
    TRUCK(0.2);

    TransportType(double price) {
        this.price = price;
    }

    private double price;

    public double calculateTravelCost(double distance) {
        return distance * price;
    }
}
