package alldays_homework;

public class Apartment {
    public static void main(String[] args) {
        /*
         - address, name of owner, number of units, average size of each unit, monthly rent amount
         , number of washers and driers, allows pets or not, has a pool, length of lease,
         total number of residents in building, phone number of owner, is near a gas station,
         number of floors, has a basement, has available units for rent, has air conditioning,
         number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)
         */
        String address = "12237 Pender Creek Circle , Fairfax, VA 22033";
        String ownerName = "Bashir Hasanov";
        int numberOfUnits = 16, unitSize = 745, monthlyRent = 1385, washerDryer = 16;
        boolean petsAllowed = true, hasPool = false, wheelchairAccess = true;
        int leaseLength = 12, residentsNumber = 43, numberOfFloors = 4, numberOfParking = 49;
        long phoneNumber = 5716850440L;
        boolean hasBasement = false, availableUnits = false, hasAirConditioning = true, gasStation = true;
        double reviewStar = 4.8;

        double rentAfter3Years = 0.9 * monthlyRent, rentAfter6Years = 0.8 * monthlyRent;
        double averageResidents = residentsNumber / numberOfUnits, averageParking = numberOfParking / numberOfUnits,
                averageUnits = numberOfUnits / numberOfFloors;

        System.out.println("\n***************WELCOME TO PENDER CREEK!***************");
        System.out.println("ADDRESS:\t\t\t\t" + address);
        System.out.println("NAME OF OWNER:\t\t\t" + ownerName);
        System.out.println("NUMBER OF UNITS:\t\t" + numberOfUnits);
        System.out.println("AVERAGE UNIT SIZE:\t\t" + unitSize + " sq.ft" );
        System.out.println("MONTHLY RENT:\t\t\t$" + monthlyRent);
        System.out.println("NUMBER OF WASHERS:\t\t" + 16);
        System.out.println("ARE PETS ALLOWED?:\t\tyes (" + petsAllowed + ")");
        System.out.println("IS THERE POOL?:\t\t\tno (" + hasPool + ")");
        System.out.println("LEASE LENGTH:\t\t\t" + leaseLength + " months\nNUMBER OF RESIDENTS:\t" +
                residentsNumber + "\nPHONE NUMBER:\t\t\t" + phoneNumber + "\nGAS STATION:\t\t\tyes (" +
                gasStation + ")\nNUMBER OF FLOORS:\t\t" + numberOfFloors +
                "\nBASEMENT:\t\t\t\tno (" + hasBasement + ")\nAVAILABLE UNITS:\t\tno (" +
                availableUnits + ")\nAIR CONDITIONING:\t\tyes (" + hasAirConditioning +
                ")\nNUMBER OF PARKING:\t\t" + numberOfParking + "\nWHEELCHAIR ACCESS:\t\tyes (" +
                wheelchairAccess + ")\nREVIEW STARS:\t\t\t* * * * * " + reviewStar);
        System.out.println("______________________________________\nRENT AFTER 3 YEARS:\t\t$" +
                rentAfter3Years + "\nRENT AFTER 6 YEARS:\t\t$" + rentAfter6Years +
                "\nRESIDENTS PER UNIT:\t\t" + averageResidents +
                "\nPARKING PER UNIT:\t\t" + averageParking +
                "\nUNITS PER FLOOR:\t\t" + averageUnits);
    }
}
