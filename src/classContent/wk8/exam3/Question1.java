package classContent.wk8.exam3;

import java.util.LinkedList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("test case01:" + minSteps("sea", "eat"));
        System.out.println("test case02:" + minSteps("leetcode", "etco"));
        System.out.println("test case03:" + minSteps("pp", "itm"));
        System.out.println("test case04:" + minSteps("nw", "for"));
        System.out.println("test case05:" + minSteps("bbs", "vjkc"));
        int i = 6;
        System.out.println("test case" + i++ + ":" + minSteps("ueg", "samq"));
        System.out.println("test case" + i++ + ":" + minSteps("dqdzw", "fzcmop"));
        System.out.println("test case" + i++ + ":" + minSteps("witim", "gkyvfy"));
        System.out.println("test case" + i++ + ":" + minSteps("balhqtzfka", "rxfdithj"));
        System.out.println("test case" + i++ + ":" + minSteps("apsuummteb", "nodfftho"));
        System.out.println("test case" + i++ + ":" + minSteps("luisgmhiihskdpj", "fdthfuczbanhqswfpw"));
        System.out.println("test case" + i++ + ":" + minSteps("jzvjinkpvlzfjzk", "jpxsbpupirervvqktm"));
        System.out.println("test case" + i++ + ":" + minSteps("zvrywlucuzvbsaezeaxa", "cwzpnxqiregjztcznereui"));
        System.out.println("test case" + i++ + ":" + minSteps("chroblesmqczebeuqixm", "rnzdqrxnbshuauxixkxwsg"));
        System.out.println("test case" + i++ + ":" + minSteps("xsugyizivpfyywnldyejjcvpv", "tqhkdhxbeobrdmzwlyltuyxau"));
        System.out.println("test case" + i++ + ":" + minSteps("rcdzsvfldsyqjbqmtoshnsxtv", "vzmcicdcyoymecjwwcvkvbihm"));
    }

    public static int minSteps(String word1, String word2) {

        return minStepsDP(word1, word2, new LinkedList<>(), new LinkedList<>());
    }

    /**
     * @param word1
     * @param word2
     * @param l1    store chars from word1 that appeared in word2
     * @param l2    store chars from word2 that appeared in word1
     * @return
     */
    public static int minStepsDP(String word1, String word2, List<Character> l1, List<Character> l2) {
        int len1 = word1.length();
        int len2 = word2.length();
        boolean hasSameChar = false;
        int count = 0;
        if (len1 > len2) {
            for (int i = 0; i < len2; i++) {
                if (word1.contains(String.valueOf(word2.charAt(i)))) {
                    hasSameChar = true;
                    l2.add(word2.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < len1; i++) {
                if (word2.contains(String.valueOf(word1.charAt(i)))) {
                    hasSameChar = true;
                    l1.add(word1.charAt(i));
                }
            }
        }
        if (!hasSameChar) { //no intersection then delete all chars
            return len1 + len2;
        }
        if (l1.size() > 0) {
            for (Character c : l1
            ) {
                if (word2.contains(String.valueOf(c))) {
                    word2 = word2.replaceFirst(String.valueOf(c), "");
                    count += 2;   //delete this c from both strings
                } /*else {
                    count++;    //delete this c from the string it exists: word1
                }*/
            }
        }
        if (l2.size() > 0) {
            for (Character c : l2
            ) {
                if (word1.contains(String.valueOf(c))) {
                    word1 = word1.replaceFirst(String.valueOf(c), "");
                    count += 2;   //delete this c from both strings
                } /*else {
                    count++;    //delete this c from the string it exists: word2
                }*/
            }
        }
        return len1 + len2 - count;
    }
}
