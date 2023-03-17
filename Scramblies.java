public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        StringBuilder builder = new StringBuilder(str1);
        for (String s : str2.split("")) {
            int i = builder.indexOf(s);
            if (i < 0) {
                return false;
            }
            builder.delete(i, i + 1);
        }
        return true;
    }
}
