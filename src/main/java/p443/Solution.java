package p443;

class Solution {
    public int compress(char[] chars) {
        int x = 0, i = 0;
        int N = chars.length;
        while (i < N) {
            int end = i + 1;
            while (end < N && chars[i] == chars[end]) {
                end++;
            }

            chars[x++] = chars[i];
            if (end - i > 1) {
                String tmp = Integer.toString(end - i);
                for (char c : tmp.toCharArray()) {
                    chars[x++] = c;
                }
            }
            i = end;
        }
        return x;
    }

}