package Overload;

import java.util.Random;

public class ClassTask55 {
    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomString()); //  dshvf (example, the actual chars could be different)

        System.out.println(RandomStringUtils.randomString(7)); //cbsassw
        System.out.println(RandomStringUtils.randomString(5, true)); // RVDHC
        System.out.println(RandomStringUtils.randomString(3, false)); //hsd

    }

    public class RandomStringUtils {
        private static final Random random = new Random();

        public static String randomString() {
            return randomString(5, false);
        }

        public static String randomString(int length) {
            return randomString(length, false);
        }

        public static String randomString(int length, boolean isUpperCase) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                int start = isUpperCase ? 'A' : 'a';
                int end = isUpperCase ? 'Z' : 'z';
                char randomChar = (char) (start + random.nextInt(end - start + 1));
                sb.append(randomChar);
            }
            return sb.toString();
        }
    }
}

