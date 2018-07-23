package de.vf.jdk10;

public class CharTests {
    public static void main(String[] args) {
        for(int i=0; i<256; i++) {
            char c = (char) i;
            System.out.println(i+" : "+c);
        }


    }

    private static void method1() {
        String s = Integer.toHexString((int) 'a');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.println((char) 91);
        System.out.println((int) 'a');
        System.out.println((int) 'z');
        String tm = "U+0024";
        char tab = '\uD840';
        System.out.println(tab + "a :" + tm);
        System.out.println(Character.toCodePoint('a','a'));
        System.out.println( Character.toChars(0x10400));
        String ascii = "10";

        // Step-1 - Convert ASCII string to char array
        char[] ch = ascii.toCharArray();

        // Step-2 Iterate over char array and cast each element to Integer.
        StringBuilder builder = new StringBuilder();

        for (char c : ch) {
            int i = (int) c;
            // Step-3 Convert integer value to hex using toHexString() method.
            builder.append(Integer.toHexString(i).toUpperCase());
        }

        System.out.println("ASCII = " + ascii);
        System.out.println("Hex = " + builder.toString());
        System.out.println(asciiToHex("A"));

        /*for(int i = 0; i < 50; i++) {
            String hex = Integer.toHexString(i);
            System.out.println("decimal: "+i+"\t Hexa : "+ hex);
        }*/
        Character.codePointOf("a");
    }

    private static String asciiToHex(String asciiStr) {
        char[] chars = asciiStr.toCharArray();
        StringBuilder hex = new StringBuilder();
        for (char ch : chars) {
            hex.append(Integer.toHexString((int) ch));
        }

        return hex.toString();
    }
}
