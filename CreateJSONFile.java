//import org.json.JSONObject;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class CreateJSONFile {
//    public static void main(String[] args) {
//        JSONObject json = new JSONObject();
//        JSONObject enUS = new JSONObject();
//        JSONObject bnBN = new JSONObject();
//
//        for (int i = 500000; i <= 500500; i++) {
//            enUS.put(Integer.toString(i), Integer.toString(i));
//            bnBN.put(Integer.toString(i), convertToBengali(i));
//        }
//
//        // Add translations to the main JSON object
//        json.put("en_US", enUS);
//        json.put("bn_BN", bnBN);
//
//        // Write JSON to file
//        try (FileWriter file = new FileWriter("numbers_translation.json")) {
//            file.write(json.toString());
//            System.out.println("JSON file created successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Method to convert numbers to Bengali representation
//    private static String convertToBengali(int number) {
//        String[] bengaliDigits = {"০", "১", "২", "৩", "৪", "৫", "৬", "৭", "৮", "৯"};
//        StringBuilder result = new StringBuilder();
//        String numberStr = Integer.toString(number);
//        for (int i = 0; i < numberStr.length(); i++) {
//            int digit = Character.getNumericValue(numberStr.charAt(i));
//            result.append(bengaliDigits[digit]);
//        }
//        return result.toString();
//    }
//}