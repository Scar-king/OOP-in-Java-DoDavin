package Lab01;

public class Ex5 {
	public static void main(String[] args) {

        // Count String length
		String text = "I Love My Hometown";
		System.out.println("Text length is: " + text.length() + "\n"); 

        // Cut the word
		String str = "I love my little country";
		String cut = "I love";
		String result = str.replaceFirst(cut, "").trim();
		
		System.out.println("Result: " + result + "\n");
		
        // Find vowels position
		String txt = "Hi Students!";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                System.out.println("\"" + ch + "\" is at index: " + i);
            }
        }

        // Check 2 texts are equal or not
        String str1 = "Hi Student!";
        String str2 = "Students";
        String str3 = "Hi Student!";

        System.out.println("\nText1 is equal to Text2: " + str1.equals(str2));
        System.out.println("Text1 is equal to Text3: " + str1.equals(str3));

        // Check text contains in another text
        String txt1 = "Hi Students!";
        String txt2 = "Students";
        String txt3 = "Teacher";

        System.out.println("\nText1 contains Text2: " + txt1.contains(txt2));
        System.out.println("Text1 contains Text3: " + txt1.contains(txt3));
 	}
}
