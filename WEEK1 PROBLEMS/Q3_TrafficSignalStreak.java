public class Q3_TrafficSignalStreak {

    public static void findLongestStreak(String signalLog) {

        char longestSignal = signalLog.charAt(0);
        int longestCount = 1;

        char currentSignal = signalLog.charAt(0);
        int currentCount = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == currentSignal) {
                currentCount++;
            } else {

                if (currentCount > longestCount) {
                    longestCount = currentCount;
                    longestSignal = currentSignal;
                }

                currentSignal = signalLog.charAt(i);
                currentCount = 1;
            }
        }

        // Check the last streak
        if (currentCount > longestCount) {
            longestCount = currentCount;
            longestSignal = currentSignal;
        }

        System.out.println("Longest Streak: '" + longestSignal
                + "' repeated " + longestCount + " times");
    }

    public static void main(String[] args) {

        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}