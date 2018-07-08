public class TimeFormatter {
    public static String formatDuration(int seconds) {
         int minutes = 0;
         int hours = 0;
         int days = 0;
         int years = 0;
         String duration = "";

         minutes = seconds / 60;
         seconds %= 60;
         hours = minutes / 60;
         minutes %= 60;
         days = hours / 24;
         hours %= 24;
         years = days / 365;
         days %= 365;

         return "";
    }
}
