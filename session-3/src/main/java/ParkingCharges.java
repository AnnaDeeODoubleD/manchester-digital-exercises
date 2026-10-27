public class ParkingCharges {
    static void main() {
        //hourMidnightToFiveAm = 300;
        //hourFiveAmToTenAm = 350;
        // hourTenAmToThreePm = 500;
        // hourThreePmToEightPm = 700;
        // hourEightPmToMidnight = 400;

        int bandA = 300;
        int bandB = 350;
        int bandC = 500;
        int bandD = 700;
        int bandE = 400;


        int hourParked = 13;
                if(hourParked <=4) {
                    System.out.println("Charges " + bandA);
                } else if( hourParked <= 9) {
                    System.out.println("Charges " + bandB);
                }else if( hourParked <=14 ){
                        System.out.println("Charges " + bandC);
                    }else if (hourParked <=19){
                        System.out.println("Charges " + bandD);
                    } else {
                        System.out.println("Charges " + bandE);

                    }
                }


    }

