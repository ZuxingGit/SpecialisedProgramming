import java.util.HashSet;
import java.util.Set;

public class Solution929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Remove dots from the local part
            local = local.replace(".", "");

            // Ignore characters after the first plus sign
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // Combine the processed local part with the domain
            String processedEmail = local + "@" + domain;
            uniqueEmails.add(processedEmail);
        }

        return uniqueEmails.size();
    }

    public static void main(String[] args) {
        Solution929 solution = new Solution929();

        String[] emails1 = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        int result1 = solution.numUniqueEmails(emails1);
        System.out.println("Output: " + result1); // Output: 2

        String[] emails2 = { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" };
        int result2 = solution.numUniqueEmails(emails2);
        System.out.println("Output: " + result2); // Output: 3
    }
}
