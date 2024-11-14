package hackerrank;

import kotlin.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeetingSchedules {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] firstLineInputs = reader.readLine().split(" ");
            int m = Integer.parseInt(firstLineInputs[0]);
            int k = Integer.parseInt(firstLineInputs[1]);
            String[] busySlots = new String[m];
            for (int i = 0; i < m; i++) {
                busySlots[i] = reader.readLine();
            }
            List<String> result = findAvailabilities(k, busySlots);
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        } catch (IOException ex) {
        }
    }

    public static List<String> findAvailabilities(int k, String[] busySlots) {
        boolean[] slots = initSlots(busySlots);
        List<String> result = new ArrayList<>();
        int start = 0, duration = 0, current;
        do {
            current = start + duration;
            if (slots[current]) {
                duration++;
            } else if (duration == 0) {
                start++;
            } else {
                if (duration >= k) {
                    result.add(String.format("%02d %02d %02d %02d", start / 60, start % 60, current / 60, current % 60));
                }
                start += duration;
                duration = 0;
            }
        } while (current + 1 < slots.length);
        if (duration >= k) {
            result.add(String.format("%02d %02d %02d %02d", start / 60, start % 60, current / 60, current % 60));
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        return result;
    }

    private static boolean[] initSlots(String[] busySlots) {
        boolean[] slots = new boolean[24 * 60];
        Arrays.fill(slots, true);
        for (int i = 0; i < busySlots.length; i++) {
            Pair<Integer, Integer> range = getRange(busySlots[i].split(" "));
            for (int x = range.getFirst(); x < range.getSecond(); x++) {
                slots[x] = false;
            }
        }
        return slots;
    }

    private static Pair<Integer, Integer> getRange(String[] inputs) {
        return new Pair<>(
                toIndex(inputs[0], inputs[1]),
                toIndex(inputs[2], inputs[3])
        );
    }

    private static Integer toIndex(String hh, String mm) {
        return Integer.parseInt(hh) * 60 + Integer.parseInt(mm);
    }
}
