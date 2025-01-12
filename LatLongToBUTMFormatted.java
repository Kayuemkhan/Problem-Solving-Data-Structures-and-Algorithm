public class LatLongToBUTMFormatted {

    // WGS84 Ellipsoid constants
    private static final double WGS84_A = 6378137.0; // Semi-major axis
    private static final double WGS84_ECC_SQ = 0.00669437999014; // First eccentricity squared
    private static final double WGS84_ECC_PRIME_SQ = WGS84_ECC_SQ / (1 - WGS84_ECC_SQ); // Second eccentricity squared
    private static final double K0 = 0.9996; // Scale factor

    // BUTM Parameters
    private static final double BUTM_CENTRAL_MERIDIAN = 90.0; // Central meridian for BUTM
    private static final double FALSE_EASTING = 500000.0; // False easting (meters)
    private static final double FALSE_NORTHING = 0.0; // False northing (adjust if for the southern hemisphere)

    public static void main(String[] args) {
// Input coordinates (latitude, longitude in decimal degrees)
//CHANGE HERE ONLY 

        double latitude = 23.2339451;
        double longitude = 89.7290968;

//CHANGE ABOVE TWO INPUTS 

        double lat_degree = latitude;
        double long_degree = longitude;


//***********************************************************************

        String million_sheet_number = "";
        String quarter_inch_map = "";
        String inch_map = "";

        int lat_min = (int) ((Math.abs(latitude) - (int) Math.abs(latitude)) * 60);
        int lat_sec = 0;


        int long_min = (int) ((Math.abs(longitude) - (int) Math.abs(longitude)) * 60);
        int long_sec = 0;


        if ((lat_degree >= 20 & lat_degree < 24) & (long_degree >= 88 & long_degree < 92)) {
            million_sheet_number = "79";
        } else if ((lat_degree >= 24 & lat_degree < 28) & (long_degree >= 88 & long_degree < 92)) {
            million_sheet_number = "78";
        } else if ((lat_degree >= 24 & lat_degree < 28) & (long_degree >= 92 & long_degree < 96)) {
            million_sheet_number = "83";
        } else if ((lat_degree >= 20 & lat_degree < 24) & (long_degree >= 92 & long_degree < 96)) {
            million_sheet_number = "84";
        } else {
            million_sheet_number = "INVALID";
        }
        System.out.println("Test1 Million Sheet Number: " + million_sheet_number);


        if ((lat_min >= 45 & lat_min < 60) & (long_min >= 0 & long_min < 15)) {
            inch_map = "1";
        } else if ((lat_min >= 30 & lat_min < 45) & (long_min >= 0 & long_min < 15)) {
            inch_map = "2";
        } else if ((lat_min >= 15 & lat_min < 30) & (long_min >= 0 & long_min < 15)) {
            inch_map = "3";
        } else if ((lat_min >= 0 & lat_min < 15) & (long_min >= 0 & long_min < 15)) {
            inch_map = "4";
        } else if ((lat_min >= 45 & lat_min < 60) & (long_min >= 15 & long_min < 30)) {
            inch_map = "5";
        } else if ((lat_min >= 30 & lat_min < 45) & (long_min >= 15 & long_min < 30)) {
            inch_map = "6";
        } else if ((lat_min >= 15 & lat_min < 30) & (long_min >= 15 & long_min < 30)) {
            inch_map = "7";
        } else if ((lat_min >= 0 & lat_min < 15) & (long_min >= 15 & long_min < 30)) {
            inch_map = "8";
        } else if ((lat_min >= 45 & lat_min < 60) & (long_min >= 30 & long_min < 45)) {
            inch_map = "9";
        } else if ((lat_min >= 30 & lat_min < 45) & (long_min >= 30 & long_min < 45)) {
            inch_map = "10";
        } else if ((lat_min >= 15 & lat_min < 30) & (long_min >= 30 & long_min < 45)) {
            inch_map = "11";
        } else if ((lat_min >= 0 & lat_min < 15) & (long_min >= 30 & long_min < 45)) {
            inch_map = "12";
        } else if ((lat_min >= 45 & lat_min < 60) & (long_min >= 45 & long_min < 60)) {
            inch_map = "13";
        } else if ((lat_min >= 30 & lat_min < 45) & (long_min >= 45 & long_min < 60)) {
            inch_map = "14";
        } else if ((lat_min >= 15 & lat_min < 30) & (long_min >= 45 & long_min < 60)) {
            inch_map = "15";
        } else if ((lat_min >= 0 & lat_min < 15) & (long_min >= 45 & long_min < 60)) {
            inch_map = "16";
        } else {
            inch_map = "INVALID";
        }
        System.out.println("Test2 Inch Map: " + inch_map);

        if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "A";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "B";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "C";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "D";
        } else if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "E";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "F";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "G";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "H";
        } else if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "I";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "J";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "K";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "L";
        } else if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "M";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "N";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "O";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "P";
        } else {
            quarter_inch_map = "INVALID";
        }
        System.out.println("Test3 Quarter Inch Map: " + quarter_inch_map);

        if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "A";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "B";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "C";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 88 & long_degree < 89)) {
            quarter_inch_map = "D";
        } else if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "E";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "F";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "G";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 89 & long_degree < 90)) {
            quarter_inch_map = "H";
        } else if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "I";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "J";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "K";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 90 & long_degree < 91)) {
            quarter_inch_map = "L";
        } else if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "M";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "N";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "O";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 91 & long_degree < 92)) {
            quarter_inch_map = "P";
        } else {
            quarter_inch_map = "INVALID";
        }

        System.out.println("Test4 Quarter Inch Map: " + quarter_inch_map);

        if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "A";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "B";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "C";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "D";
        } else if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "E";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "F";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "G";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "H";
        } else if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "I";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "J";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "K";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "L";
        } else if ((lat_degree >= 27 & lat_degree < 28) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "M";
        } else if ((lat_degree >= 26 & lat_degree < 27) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "N";
        } else if ((lat_degree >= 25 & lat_degree < 26) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "O";
        } else if ((lat_degree >= 24 & lat_degree < 25) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "P";
        } else {
            quarter_inch_map = "INVALID";
        }

        System.out.println("Test5 Quarter Inch Map: " + quarter_inch_map);

        if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "A";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "B";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "C";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 92 & long_degree < 93)) {
            quarter_inch_map = "D";
        } else if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "E";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "F";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "G";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 93 & long_degree < 94)) {
            quarter_inch_map = "H";
        } else if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "I";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "J";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "K";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 94 & long_degree < 95)) {
            quarter_inch_map = "L";
        } else if ((lat_degree >= 23 & lat_degree < 24) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "M";
        } else if ((lat_degree >= 22 & lat_degree < 23) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "N";
        } else if ((lat_degree >= 21 & lat_degree < 22) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "O";
        } else if ((lat_degree >= 20 & lat_degree < 21) & (long_degree >= 95 & long_degree < 96)) {
            quarter_inch_map = "P";
        } else {
            quarter_inch_map = "INVALID";
        }

        System.out.println("Test6 Quarter Inch Map: " + quarter_inch_map);

//***********************************************************************


// Convert to BUTM
        BUTMResult butmResult = latLonToBUTM(latitude, longitude);

// Format and display the result
        String formattedEasting = formatBUTMValue(butmResult.easting);
        String formattedNorthing = formatBUTMValue(butmResult.northing);

        System.out.println("Formatted BUTM Easting: " + formattedEasting);
        System.out.println("Formatted BUTM Northing: " + formattedNorthing);
    }

    public static BUTMResult latLonToBUTM(double latitude, double longitude) {
// Convert latitude and longitude to radians
        double latRad = Math.toRadians(latitude);
        double lonRad = Math.toRadians(longitude);
        double centralMeridianRad = Math.toRadians(BUTM_CENTRAL_MERIDIAN);

// Compute transverse Mercator projection terms
        double N = WGS84_A / Math.sqrt(1 - WGS84_ECC_SQ * Math.sin(latRad) * Math.sin(latRad));
        double T = Math.tan(latRad) * Math.tan(latRad);
        double C = WGS84_ECC_PRIME_SQ * Math.cos(latRad) * Math.cos(latRad);
        double A = Math.cos(latRad) * (lonRad - centralMeridianRad);

// Meridian distance (M)
        double M = WGS84_A * (
                (1 - WGS84_ECC_SQ / 4 - 3 * WGS84_ECC_SQ * WGS84_ECC_SQ / 64 - 5 * WGS84_ECC_SQ * WGS84_ECC_SQ * WGS84_ECC_SQ / 256) * latRad
                        - (3 * WGS84_ECC_SQ / 8 + 3 * WGS84_ECC_SQ * WGS84_ECC_SQ / 32 + 45 * WGS84_ECC_SQ * WGS84_ECC_SQ * WGS84_ECC_SQ / 1024) * Math.sin(2 * latRad)
                        + (15 * WGS84_ECC_SQ * WGS84_ECC_SQ / 256 + 45 * WGS84_ECC_SQ * WGS84_ECC_SQ * WGS84_ECC_SQ / 1024) * Math.sin(4 * latRad)
                        - (35 * WGS84_ECC_SQ * WGS84_ECC_SQ * WGS84_ECC_SQ / 3072) * Math.sin(6 * latRad)
        );

// Calculate easting and northing
        double easting = K0 * N * (A + (1 - T + C) * Math.pow(A, 3) / 6 + (5 - 18 * T + T * T + 72 * C - 58 * WGS84_ECC_PRIME_SQ) * Math.pow(A, 5) / 120) + FALSE_EASTING;

        double northing = K0 * (M + N * Math.tan(latRad) * (A * A / 2 + (5 - T + 9 * C + 4 * C * C) * Math.pow(A, 4) / 24 + (61 - 58 * T + T * T + 600 * C - 330 * WGS84_ECC_PRIME_SQ) * Math.pow(A, 6) / 720));

// Add false northing if needed (e.g., for southern hemisphere adjustments)
        northing += FALSE_NORTHING;

        return new BUTMResult(easting, northing);
    }

    public static String formatBUTMValue(double value) {
// Extract components
        int kilometers = (int) (value / 1000); // Kilometers (first 3 digits)
        int meters = (int) (value % 1000); // Remaining whole meters (next 3 digits)
        double fractionalMeters = value % 1; // Fractional part of meters

// Format the components
        String kmPart = String.format("%03d", kilometers); // Pad to 3 digits
        String meterPart = String.format("%03d", meters); // Pad to 3 digits
        String fractionPart = String.format("%.6f", fractionalMeters).substring(2); // Fractional part

// Combine parts into the desired format
        return kmPart + "-" + meterPart + "-" + fractionPart;
    }

    // Class to hold BUTM results
    public static class BUTMResult {
        public final double easting;
        public final double northing;

        public BUTMResult(double easting, double northing) {
            this.easting = easting;
            this.northing = northing;
        }
    }
}