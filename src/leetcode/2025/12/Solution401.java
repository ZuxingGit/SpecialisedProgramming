import java.util.ArrayList;
import java.util.List;

public class Solution401 {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        if (turnedOn < 0 || turnedOn > 8) {
            return result;
        }

        for (int hour = 0; hour < 12; hour++) {
            int hourBits = Integer.bitCount(hour);
            if (hourBits > turnedOn) {
                continue;
            }
            for (int minute = 0; minute < 60; minute++) {
                if (hourBits + Integer.bitCount(minute) != turnedOn) {
                    continue;
                }
                result.add(hour + ":" + (minute < 10 ? "0" : "") + minute);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution401 solution = new Solution401();

        int turnedOn1 = 1;
        List<String> result1 = solution.readBinaryWatch(turnedOn1);
        System.out.println("Times with " + turnedOn1 + " LEDs on: " + result1);

        int turnedOn2 = 3;
        List<String> result2 = solution.readBinaryWatch(turnedOn2);
        System.out.println("Times with " + turnedOn2 + " LEDs on: " + result2);

        int turnedOn3 = 9;
        List<String> result3 = solution.readBinaryWatch(turnedOn3);
        System.out.println("Times with " + turnedOn3 + " LEDs on: " + result3);
    }
}
