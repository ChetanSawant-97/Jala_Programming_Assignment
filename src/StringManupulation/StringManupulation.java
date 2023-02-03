package StringManupulation;

import java.util.Locale;

public class StringManupulation
{
    //creating String literal

    static String str = "Java Programming";

    //Creating String Object using new keyword
    static String str2 = new String("Java Programming");


    //Concatenation
    static void stringConcatenation()
    {
        String str3 = str + str2;
    }

    //Length of String
    static void findingLength(){
        int lenth = str.length();
    }

    //Extracting String
    static void extractingString()
    {
        String subString = str.substring(1,2);
    }

    //Searching in String
    static void searchingInString()
    {
        int index = str.indexOf("J");
    }

    //Matching a String using Regex
    static void regexDemo()
    {

    }

    //Comparing Strings
    static void comparingStrings()
    {
        boolean result = str.equals(str2);
    }

    //starts with, equalsIgnoreCase, endsWith, and Compare to
    static void stringmanupulation(String s1, String s2)
    {
        //starts With
        boolean startsWith = s1.startsWith("J");

        //equals Ignore case
        boolean ignoreCaseEquals = s1.equalsIgnoreCase(s2);

        //ends With
        boolean endsWith = s1.endsWith("g");

        //compare to
        int result = s1.compareTo(s2);
    }


    //trimming
    static void trimString()
    {
        String newString = str.trim();
    }

    //replace Chars
    static void replaceDemo()
    {
        String replacedString = str.replace('J', 'P');
    }

    //Splitting String
    static void splittingString()
    {
         String[] strArr = str.split(" ");
    }

    //Converting numbers to String
    static void valueOfDemo()
    {
        String valueOfString = String.valueOf(2134);
    }

    //Integer Object to String
    static void integrObjectToString()
    {
        Integer integer = new Integer(123456);
        String newString = String.valueOf(integer);

    }

    //Uppercase and Lowercase
    static void upperLowerCaseDemo()
    {
        String name = "Chetan";
        String uppperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();
    }

}
