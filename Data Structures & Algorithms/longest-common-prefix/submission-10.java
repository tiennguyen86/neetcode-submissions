public class Solution {

    public String longestCommonPrefix(String[] strs) {

        String result = "";

        for (int viTriKyTu = 0; viTriKyTu < strs[0].length(); viTriKyTu++) {

            for (int viTriChuoi = 0; viTriChuoi < strs.length; viTriChuoi++) {

                if (viTriKyTu == strs[viTriChuoi].length()) {
                    return result;
                }

                if (strs[viTriChuoi].charAt(viTriKyTu)
                        != strs[0].charAt(viTriKyTu)) {
                    return result;
                }
            }

            result += strs[0].charAt(viTriKyTu);
        }

        return result;
    }
}