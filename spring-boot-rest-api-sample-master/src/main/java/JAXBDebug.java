//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.10 at 02:37:18 PM IST 
//

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import com.company.myloyal.Address;
import com.company.myloyal.Booking;
import com.company.myloyal.BookingList;
import com.company.myloyal.Customer;
import com.company.myloyal.Error;
import com.company.myloyal.GetCustomerProfileData;
import com.company.myloyal.GetCustomerProfileDataResponse;
import com.company.myloyal.LoyaltyPoints;
import com.company.myloyal.LoyaltyPointsList;
import com.company.myloyal.ObjectFactory;
import com.company.myloyal.RetrieveCustomerBookings;
import com.company.myloyal.RetrieveCustomerBookingsResponse;
import com.company.myloyal.RetrieveCustomerLoyaltyPoints;
import com.company.myloyal.RetrieveCustomerLoyaltyPointsResponse;
import com.company.myloyal.SearchCustomerBookings;
import com.company.myloyal.SearchCustomerBookingsResponse;
import com.company.myloyal.Station;
import com.company.myloyal.Telephone;

public class JAXBDebug {


    public static JAXBContext createContext(ClassLoader classLoader)
        throws JAXBException
    {
        return JAXBContext.newInstance(Booking.class, Booking.CostSummary.class, Booking.Journey.class, GetCustomerProfileData.class, RetrieveCustomerBookings.class, RetrieveCustomerBookingsResponse.class, BookingList.class, Error.class, SearchCustomerBookingsResponse.class, RetrieveCustomerLoyaltyPoints.class, SearchCustomerBookings.class, RetrieveCustomerLoyaltyPointsResponse.class, LoyaltyPointsList.class, GetCustomerProfileDataResponse.class, Customer.class, Address.class, Station.class, Telephone.class, LoyaltyPoints.class, Booking.Passenger.class, Booking.Extra.class, Booking.CostSummary.CostingItem.class, Booking.Journey.Leg.class, Booking.Journey.Carrier.class, ObjectFactory.class);
    }

}