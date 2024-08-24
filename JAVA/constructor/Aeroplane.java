class Aeroplane {
    String company;
    int noOfSeats;
    double ticketPrice;
    String source;
    String destination;

    Aeroplane() {
        System.out.println("No-parameter constructor:");
    }

    Aeroplane(String company, int noOfSeats, double ticketPrice, String source, String destination) {
        System.out.println("Constructor with all parameters:");
        System.out.println(this.company);
        System.out.println(company);
        System.out.println(this.noOfSeats);
        System.out.println(noOfSeats);
        System.out.println(this.ticketPrice);
        System.out.println(ticketPrice);
        System.out.println(this.source);
        System.out.println(source);
        System.out.println(this.destination);
        System.out.println(destination);
    }

    Aeroplane(String company, String source, String destination) {
        System.out.println("Constructor with company, source, and destination parameters:");
        System.out.println(this.company);
        System.out.println(company);
        System.out.println(this.source);
        System.out.println(source);
        System.out.println(this.destination);
        System.out.println(destination);
    }

    Aeroplane(String company, double ticketPrice, String source, String destination) {
        System.out.println("Constructor with company, ticketPrice, source, and destination parameters:");
        System.out.println(this.company);
        System.out.println(company);
        System.out.println(this.ticketPrice);
        System.out.println(ticketPrice);
        System.out.println(this.source);
        System.out.println(source);
        System.out.println(this.destination);
        System.out.println(destination);
    }
}
