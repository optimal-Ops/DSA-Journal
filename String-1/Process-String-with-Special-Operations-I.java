class Solution {
    public String processStr(String s) {
        StringBuilder str=new StringBuilder();

    
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                if (str.length() > 0)
                    str.deleteCharAt(str.length() - 1);
            } else if (ch == '#') {
                str.append(str.toString());  // duplicate the current string
            } else if (ch == '%') {
                str.reverse();  // reverse the string
            } else {
                str.append(ch);  // regular character
            }
        }

        return str.toString();
}
}