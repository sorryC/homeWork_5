import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int lastYears = LocalDate.now().getYear();
        int flyStart = lastYears - 200;
        int flyEnd = lastYears + 100;
        for (int i = flyStart; i < flyEnd; i++) {
        if (i % 79 == 0) {
            System.out.println(i);
            }
        }

    }
}