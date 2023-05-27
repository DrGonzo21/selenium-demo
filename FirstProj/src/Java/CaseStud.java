public class CaseStud {
    public static void main(String[] args) {


        System.out.println(everyDayMessage("Friday"));
    }
 public static String everyDayMessage(String day) {

    String result = switch (day) {

        case "Monday", "Tuesday ", "Wednesday", "Thursday" -> "Working Hard!!!";
        case "Friday" -> "The weekend is almost here! TGIF!!!";
        case "Saturday", "Sunday" -> "It's party time! Alright, Alright, Alright!";
        default -> "You partied too hard this weekend!";
    } return result;

}
}