package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;
import java.util.Random;
import java.net.BindException;

public class Main
{
    public static void main( String[] args )
    {
        String sdepart="2023-04-10";
        LocalDate depart=LocalDate.parse(sdepart);
        String sreturn="2023-05-10";
        LocalDate returnDate=LocalDate.parse(sreturn);
        Random random=new Random();
        int flightID = random.nextInt(6666);
        String FlightNumber="FOF"+flightID;
        String SourceAirport="NANJING LUKOU INTERNATIONAL AIRPORT ";
        String DestinationAirport="OULU AIRPORT";
        int size=3;
        FlightBooking fb=new FlightBooking(size);
        String [] FullName={"Matt Jive", "Sally Fields", "Posh Quattro"};
        String [] Gender={"Male", "Female", "Other"};
        int [] Age={43,32,21};
        for(int Q=0; Q<size; ++Q){
            fb.setPassengerFullName(Q, FullName[Q]);
            fb.setPassengerGender(Q, Gender[Q]);
            fb.setPassengerAge(Q, Age[Q]);
        }

        for(int G=0;G<size;++G){
            if((fb.getPassengerFullName(G)==FullName[G])&&(fb.getPassengerGender(G)==Gender[G])
                    && fb.getPassengerAge(G) == Age[G]){
                fb.setPassengerFullName(1,"Matt Jive");
            }
            else{
                fb.setPassengerFullName(1,"Sally Fields");
            }
        }
        for (int J=0;J<size;++J){
            fb.setTicketNumber(J);
        }

        String ticketNumber = fb.getTicketNumber(3);
        System.out.println(ticketNumber);
        int result=fb.getTotalPassengers();
        fb.setTotalPassengers(1,3);
        fb.setFlightCompany("Flights-of-Fancy");
        fb.setDepartureDate(depart);
        fb.setReturnDate(returnDate);
        fb.setTripSource("2") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setPassengerFullName(1,"Joe Doe");

        System.out.println("Dear " + fb.getPassengerFullName(1) + ". Thank you for booking your flight with " +
                fb.getFlightCompany() + "." +" \n " +
                "Following are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + fb.getTicketNumber(1) + "\n" +
                "From " + fb.getTripSource() + " to " + fb.getTripDestination() + "\n" +
                "Date of departure: " + fb.getDepartureDate() + "\n" +
                "Date of return: " + fb.getReturnDate() + "\n" +
                "Total passengers: " + fb.getTotalPassengers() + "\n" +
                "Total ticket price in Euros: " + fb.getTotalTicketPrice());
    }
}
