package prog2.exercise5.flight.booking.system;

import java.util.Random;
import java.time.LocalDate;

public class FlightBooking{
    private String FlightCompany;
    private String SourceAirport;
    private String DestinationAirport;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private LocalDate TripDate;
    private String[] PassengerFullName;
    private String[] PassengerGender;
    private int [] PassengerAge;
    private int ChildPassengers;
    private int AdultPassengers;
    private int TotalPassengers;
    private int TotalTickets;
    private double DepartureTicketPrice;
    private double ReturnTicketPrice;
    private double TotalTicketPrice;

    public FlightBooking(int totalTickets){
        this.PassengerFullName=new String[totalTickets];
        this.PassengerGender=new String[totalTickets];
        this.PassengerAge=new int[totalTickets];
        this.TicketNumber=new String[totalTickets];
        this.TotalTickets=totalTickets;
    }

    String [] FullName={"Matt Jive","Sally Fields","Posh Quattro"};
    String [] Gender={"Male","Female","Other"};
    int [] Age={43, 32, 21};
    String sdepart="2023-04-10";
    String sreturn = "2023-05-10";
    LocalDate departureDate=LocalDate.parse(sdepart);
    LocalDate returnDate=LocalDate.parse(sreturn);

    private String FlightBooking;
    private BookingClass BookingClass;
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }

    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1":
                this.BookingClass=BookingClass.FIRST;
                break;
            case "2":
                this.BookingClass=BookingClass.BUSINESS;
                break;
            case "3":
                this.BookingClass=BookingClass.ECONOMY;
                break;
            default:
                break;
        }
    }


    public LocalDate getTripDate(){
        return TripDate;
    }

    private TripType TripType;
    enum TripType{
        ONE_WAY,RETURN
    }

    public TripType getTripType() {
        return TripType;
    }

    public void setTripType(String triptype){
        switch(triptype){
            case "1":
                this.TripType=TripType.ONE_WAY;
                break;
            case "2":
                this.TripType=TripType.RETURN;
                break;
            default:
                break;
        }
    }

    private TripSource TripSource;
    enum TripSource{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }

    public TripSource getTripSource(){
        return TripSource;
    }

    public void setTripSource(String Source){
        switch(Source){
            case "1":
                this.TripSource=TripSource.NANJING;
                break;
            case "2":
                this.TripSource=TripSource.BEIJING;
                break;
            case "3":
                this.TripSource=TripSource.OULU;
                break;
            case "4":
                this.TripSource=TripSource.HELSINKI;
                break;
            case "5":
                this.TripSource=TripSource.SHANGHAI;
                break;
            case "6":
                this.TripSource=TripSource.PARIS;
                break;
            default:
                break;
        }
    }

    private TripDestination TripDestination;
    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }

    public TripDestination getTripDestination(){
        return TripDestination;
    }

    public void setTripDestination(String TripDestination0,String TripDestination1){
        switch(TripDestination1){
            case "1":
                this.TripDestination=TripDestination.NANJING;
                break;
            case "2":
                this.TripDestination=TripDestination.BEIJING;
                break;
            case "3":
                this.TripDestination=TripDestination.SHANGHAI;
                break;
            case "4":
                this.TripDestination=TripDestination.OULU;
                break;
            case "5":
                this.TripDestination=TripDestination.HELSINKI;
                break;
            case "6":
                this.TripDestination=TripDestination.PARIS;
                break;
            default:
                break;
        }
    }

    private String SourceAirport0;
    public String getSourceAirport(){
        return SourceAirport;
    }

    public void setSourceAirport(String SourceAirport0) {
        switch(TripSource){
            case NANJING:
                this.SourceAirport="Nanjing LuKou International Airport";
                break;
            case OULU:
                this.SourceAirport="OuLu Airport";
                break;
            case BEIJING:
                this.SourceAirport="Beijing Capital International Airport";
                break;
            case PARIS:
                this.SourceAirport="Paris Charles de Gaulle Airport";
                break;
            case HELSINKI:
                this.SourceAirport="Helsinki Airport";
                break;
            case SHANGHAI:
                this.SourceAirport="Shanghai PuDong International Airport";
                break;
            default:
                break;
        }
    }

    private String DestinationAirport0;
    public String getDestinationAirport(){
        return DestinationAirport;
    }

    public void setDestinationAirport(String DestinationAirport1,String DestinationAirport2) {
        this.DestinationAirport="";
        switch(TripDestination){
            case NANJING:
                this.DestinationAirport="Nanjing LuKou International Airport";
                break;
            case BEIJING:
                this.DestinationAirport="Beijing Capital International Airport";
                break;
            case SHANGHAI:
                this.DestinationAirport="Shanghai PuDong International Airport";
                break;
            case OULU:
                this.DestinationAirport="OuLu Airport";
                break;
            case HELSINKI:
                this.DestinationAirport="Helsinki Airport";
                break;
            case PARIS:
                this.DestinationAirport="Paris Charles de Gaulle Airport";
                break;
            default:
                break;
        }
    }

    Random random=new Random();

    private String[] TicketNumber;

    public void setTicketNumber(int ht){
        String ticketNumber=null;
        switch (TripType){
            case ONE_WAY:
                ticketNumber="11";
                break;
            case RETURN:
                ticketNumber="22";
                break;
        }

        switch(BookingClass){
            case FIRST:
                ticketNumber=ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber=ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber=ticketNumber + "E";
                break;
        }

        for(int ss=0;ss<4;ss++){
            char xx=(char)((random.nextInt(26)+65));
            ticketNumber=ticketNumber+xx;
        }
        switch(TripSource){
            case SHANGHAI:
                switch(TripDestination){
                    case BEIJING:
                    case NANJING:
                        ticketNumber=ticketNumber+"DOM";
                        break;
                    case HELSINKI:
                    case PARIS:
                    case OULU:
                        ticketNumber=ticketNumber+"INT";
                        break;
                    default:
                        break;
                }
                break;
            case OULU:
                switch(TripDestination){
                    case HELSINKI:
                        ticketNumber=ticketNumber+"DOM";
                        break;
                    case PARIS:
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber=ticketNumber+"INT";
                        break;
                    default:
                        break;
                }
                break;
            case NANJING:
                switch(TripDestination){
                    case SHANGHAI:
                    case BEIJING:
                        ticketNumber=ticketNumber+"DOM";
                        break;
                    case PARIS:
                    case HELSINKI:
                    case OULU:
                        ticketNumber=ticketNumber+"INT";
                        break;
                    default:
                        break;
                }
                break;
            case BEIJING:
                switch(TripDestination){
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber=ticketNumber+"DOM";
                        break;
                    case PARIS:
                    case HELSINKI:
                    case OULU:
                        ticketNumber=ticketNumber+"INT";
                        break;
                    default:
                        break;
                }
                break;
            case PARIS:
                switch(TripDestination){
                    case HELSINKI:
                    case OULU:
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber=ticketNumber+"INT";
                        break;
                    default:
                        break;
                }
                break;
            case HELSINKI:
                switch(TripDestination){
                    case OULU:
                        ticketNumber=ticketNumber+"DOM";
                        break;
                    case PARIS:
                    case BEIJING:
                    case SHANGHAI:
                    case NANJING:
                        ticketNumber=ticketNumber+"INT";
                        break;
                    default:
                        break;
                }
                break;
        }
        this.TicketNumber[ht]=ticketNumber;
    }
    public LocalDate getDepartureDate()
    {
        return DepartureDate;
    }
    public void setDepartureDate(LocalDate DepartureDate0)
    {
        String sdepart="2023-04-10";
        this.DepartureDate=LocalDate.parse(sdepart);
    }
    public LocalDate getReturnDate()
    {
        return ReturnDate;
    }
    public void setReturnDate(LocalDate returnDate)
    {
        String sreturn =  "2023-05-10";
        this.ReturnDate=departureDate.plusDays(2);
    }
    public String getFlightCompany()
    {
        return FlightCompany;
    }
    public void setFlightCompany(String FlightCompany0)
    {
        this.FlightCompany=FlightCompany0;
    }
    public String getTicketNumber(int BSSZ) {
        setTicketNumber(1);
        return TicketNumber[BSSZ];
    }
    public String getPassengerGender(int zx){
        return PassengerGender[zx];
    }
    public void setPassengerGender(int anywn,String PassengerGender0) {
        this.PassengerGender=new String[]{"Male","Female","Other"};
    }
    public int getPassengerAge(int SHHZ){
        return PassengerAge[SHHZ];
    }
    public void setPassengerAge(int SHBDC,int PassengerAge0) {
        this.PassengerAge=new int[]{43, 32, 21};
    }
    public String getPassengerFullName(int JMS){
        return PassengerFullName[JMS];
    }
    public void setPassengerFullName(int HSMYJ,String PassengerFullName0){
        this.PassengerFullName=new String[]{"Matt Jive","Sally Fields","Posh Quattro"};
    }
    public int getChildPassengers()
    {
        return ChildPassengers;
    }
    public void setChildPassengers(int ChildPassengers0)
    {
        this.ChildPassengers=ChildPassengers0;
    }
    public int getAdultPassengers()
    {
        return AdultPassengers;
    }
    public void setAdultPassengers(int AdultPassengers0)
    {
        this.AdultPassengers=AdultPassengers0;
    }
    public int getTotalPassengers()
    {
        return TotalPassengers;
    }
    public void setTotalPassengers(int TotalPassengers0, int TotalPassengers1)
    {
        this.TotalPassengers=ChildPassengers+AdultPassengers;
    }
    public double getDepartureTicketPrice(){

        return DepartureTicketPrice;
    }
    public double getReturnTicketPrice(){

        return ReturnTicketPrice;
    }
    public double getTotalTicketPrice()
    {
        return TotalTicketPrice;
    }
    public void setTotalTicketPrice()
    {
        this.TotalTicketPrice=Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }
    public void setReturnTicketPrice(){

        this.ReturnTicketPrice=ReturnTicketPrice;
    }
    public void setDepartingTicketPrice(int Child0, int Adult0) {

        this.DepartureTicketPrice=DepartureTicketPrice;
    }

    public String toString() {
        return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
                FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + TicketNumber + "\n" +
                "From " + TripSource + " to " + TripDestination + "\n" +
                "Date of departure: " + DepartureDate + "\n" +
                "Date of return: " + ReturnDate + "\n" +
                "Total passengers: " + TotalPassengers + "\n" +
                "Total ticket price in Euros: " + TotalTicketPrice;
    }
    private ConfirmationMessage confirmationMessage;

    enum ConfirmationMessage {
        CHANGE, SAVE
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.confirmationMessage = confirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + TripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        ReturnDate + ")\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.confirmationMessage = confirmationMessage.SAVE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + TicketNumber + "\n" +
                        "Passenger Name: " + PassengerFullName + "\n" +
                        "From TripSource to " + TripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: " + ReturnDate + "\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n");

                break;
        }
    }

    public void displayTripDetails() {
        System.out.println("Thank you for booking your flights with " + FlightCompany + "\n");
        System.out.println("You reserved a total of" + TotalTickets + " tickets.\n");
        for (int A=0;A<TotalTickets;A++){
            System.out.println("Here are the trip details for Passenger No." + (A+1));
            System.out.println("Passenger's Ticket Number:" + getTicketNumber(A));
            System.out.println("Passenger's Full Name: " + getPassengerFullName(A));
            System.out.println("Passenger's Age:" + getPassengerAge(A));
            System.out.println("Passenger's Gender:" + getPassengerGender(A));
            System.out.println("From:" + TripSource);
            System.out.println("To:" + TripDestination);
            System.out.println("The flight departs on:" + departureDate);
            System.out.println("And the return flight is on:" + returnDate);
        }
    }
}