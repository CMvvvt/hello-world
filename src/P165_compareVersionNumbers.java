public class P165_compareVersionNumbers {
    class Solution {
        public int compareVersion(String version1, String version2) {
            String[] str1 = version1.split("\\.");
            String[] str2 = version2.split("\\.");
            int len1 = str1.length, len2 = str2.length;
            int small = Math.min(len1, len2), large = Math.max(len1, len2);
            for(int i = 0; i < small; i++) {
                int value1 = Integer.parseInt(str1[i]);
                int value2 = Integer.parseInt(str2[i]);
                if(value1 > value2) {
                    return 1;
                }
                if(value1 < value2) {
                    return -1;
                }
            }
            for(int i = small; i < large; i++) {
                int value;
                if(len1 > len2) {
                    value = Integer.parseInt(str1[i]);
                    if(value > 0) return 1;
                } else {
                    value = Integer.parseInt(str2[i]);
                    if(value > 0) return -1;
                }
            }
            return 0;
        }
    }

    /**
     * Simplified code for method 1.
     */
    class Solution2{
        public int compareVersion(String version1, String version2) {
            String[] str1 = version1.split("\\.");
            String[] str2 = version2.split("\\.");
            int len1 = str1.length, len2 = str2.length;
            int value1, value2;
            for(int i = 0; i < Math.max(len1, len2); i++) {
                value1 = len1 > i ? Integer.parseInt(str1[i]) : 0;
                value2 = len2 > i ? Integer.parseInt(str2[i]) : 0;
                if(value1 != value2) return value1 > value2 ? 1 : -1;
            }
            return 0;
        }
    }
}
