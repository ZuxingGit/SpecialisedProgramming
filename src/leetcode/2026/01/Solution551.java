public class Solution551 {
    public boolean checkRecord(String s) {
        int absences = 0;
        int consecutiveLates = 0;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absences++;
                if (absences > 1) {
                    return false;
                }
                consecutiveLates = 0;
            } else if (c == 'L') {
                consecutiveLates++;
                if (consecutiveLates > 2) {
                    return false;
                }
            } else {
                consecutiveLates = 0;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution551 solution = new Solution551();

        String s1 = "PPALLP";
        System.out.println("Is the attendance record '" + s1 + "' acceptable? " +
                solution.checkRecord(s1));

        String s2 = "PPALLL";
        System.out.println("Is the attendance record '" + s2 + "' acceptable? " +
                solution.checkRecord(s2));
    }
}
