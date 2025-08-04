class Solution {
    public char processStr(String s, long k) {
        String str = s;
        long length = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                length++;
            } else if (ch == '*') {
                if (length > 0) length--;
            } else if (ch == '#') {
                length = Math.min(length * 2, (long)1e15 + 5);
            }
        }
        if (k < 0 || k >= length) return '.';
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (k == length - 1) return ch;
                length--;
            } else if (ch == '*') {
                length++;
            } else if (ch == '#') {
                long half = length / 2;
                if (k >= half) k -= half;
                length = half;
            } else {
                k = length - 1 - k;
            }
        }
        return str;


    }
}