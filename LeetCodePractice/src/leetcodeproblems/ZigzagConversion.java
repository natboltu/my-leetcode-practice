package leetcodeproblems;

import java.util.ArrayList;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if(s.length() == 1) {
            return s;
        }
        var rows = new ArrayList<StringBuilder>();
        for(int i = 0; i < Math.min(s.length(), numRows); i++) {
            rows.add(new StringBuilder());
        }
        boolean goDown = false;
        int curRow = 0;

        for(int i = 0; i < s.length(); i++) {
            rows.get(curRow).append(s.charAt(i));
            if(curRow == 0 || curRow == numRows - 1) {
                goDown = !goDown;
            }
            curRow = goDown ? 1: -1;
        }
        var result = new StringBuilder();
        for(int i = 0; i < rows.size(); i++) {
            result.append(rows.get(i));
        }
        return  result.toString();
    }
    public static void main(String[] args) {
        ZigzagConversion zig = new ZigzagConversion();
        System.out.println(zig.convert("PAYPALISHIRING", 3));
    }
}
