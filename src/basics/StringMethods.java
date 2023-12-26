package basics;
public class StringMethods {

	public static void main(String[] args) {
		/*String:The strings in java are a collection of characters bound by double quotes("").
		 * ->They are immutable, i.e once they are declared, their values cannot be changed.
		 * ->String can also be listed as an array of characters starting at the index 0 and ending with a null character (\0).
		 * ->This means that the first letter of the string is at index 0 to the last character of the string which is indexed at (length of the string-1).
		 */
		/*Methods to declare string in java
		 * 1. By using New Keyword -> String language = new String ("Java");
		 * 2. By using String Literal -> String language = "Java";
		 *    ->While using literal String object is not created explicitly by user. So the compiler will create the object for us.
		 *    But, if we have the same string initialization in a different line, then the initialization would not be completed and no new object 
		 *    would be created.for example,
		 *    String s1 = "Sujit Majety";
		 *    String s2 = "Sujit Majety";
		 *    For the first string the java object is created, which references s1.
		 *    However when the second line is executed the s2 instance points to the same old “Sujit Majety” object which was declared before.
		 *    No new objects are created.
		 */
		//Demonstrating String declaration.
		String course1 = "Java";
		String course2 = new String("Python");
		System.out.println(course1);
		System.out.println(course2);
		/*String Class Methods:
		 * 		There are a lot of methods in String class.
		 * 		Most Commonly used are length, charAt, subString(int i), subString(int i, int j), concat, indexOf, 
		 * 		equals, compareTo, toLowerCase, toUpperCase, trim, replace
		 */
		//1. char charAt(int index): It returns the character at the specified index.
		String word = "I Am Invincible";
		System.out.println("\n"+word);
		System.out.println("Character at 0th position is :"+word.charAt(0));
		System.out.println("Character at 2nd position is :"+word.charAt(2));
		System.out.println("Character at 6th position is :"+word.charAt(6));
		System.out.println("Character at 14th position is:"+word.charAt(14));
		//2. boolean equals(Object obj): Compares the string with the specified string and returns true if both matches else false.
		String firstWord = "Sujit";
		String secondWord = "Majety";
		String thirdWord = "Sujit";
		System.out.println();
		System.out.println(firstWord+"=="+secondWord+" : "+firstWord.equals(secondWord));
		System.out.println(secondWord+"=="+thirdWord+" : "+secondWord.equals(thirdWord));
		System.out.println(firstWord+"=="+thirdWord+" : "+firstWord.equals(thirdWord));
		//3. boolean equalsIgnoreCase(String string): It works same as equals method but it doesn’t consider the case while comparing strings.
		String nameInCapitals = "SUJIT MAJETY";
		String nameInCamelCase = "Sujit Majety";
		System.out.println();
		System.out.println("equals Method");
		System.out.println(nameInCapitals+"=="+nameInCamelCase+" : "+nameInCapitals.equals(nameInCamelCase));
		System.out.println("equalsIgnoreCase Method");
		System.out.println(nameInCapitals+"=="+nameInCamelCase+" : "+nameInCapitals.equalsIgnoreCase(nameInCamelCase));
		//4. int compareTo(String string): This method compares the two strings based on the Unicode value of each character in the strings.
		firstWord = "Alphabet";
		secondWord = "Bandit";
		System.out.println();
		System.out.println("compareTo Method");
		System.out.println("Comparing "+firstWord+" with "+secondWord+" results: "+firstWord.compareTo(secondWord));
		System.out.println("Comparing "+firstWord+" with "+firstWord+" results: "+firstWord.compareTo(firstWord));
		System.out.println("Comparing "+secondWord+" with "+firstWord+" results: "+secondWord.compareTo(firstWord));
		//5. int compareToIgnoreCase(String string): Same as CompareTo method however it ignores the case during comparison.
		firstWord = "Alphabet";
		secondWord = "bandit";
		System.out.println();
		System.out.println("compareToIgnoreCase Method");
		System.out.println("Comparing "+firstWord+" with "+secondWord+" results: "+firstWord.compareToIgnoreCase(secondWord));
		System.out.println("Comparing "+firstWord+" with "+firstWord+" results: "+firstWord.compareToIgnoreCase(firstWord));
		System.out.println("Comparing "+secondWord+" with "+firstWord+" results: "+secondWord.compareToIgnoreCase(firstWord));
		//6. boolean startsWith(String prefix): It tests whether the string is having specified prefix, if yes then it returns true else false.
		//7. boolean startsWith(String prefix, int offset): It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
		System.out.println();
		System.out.println("startsWith Method");
		System.out.println(nameInCamelCase + " starts with Suj : "+nameInCamelCase.startsWith("Suj"));
		System.out.println(nameInCamelCase + " starts with Maj : "+nameInCamelCase.startsWith("Maj"));
		System.out.println(nameInCamelCase.substring(6) + " starts with Maj : "+nameInCamelCase.startsWith("Maj", 6));
		//8. boolean endsWith(String suffix): Checks whether the string ends with the specified suffix.
		System.out.println();
		System.out.println("endsWith Method");
		System.out.println(nameInCamelCase + " ends with ety : "+nameInCamelCase.endsWith("ety"));
		System.out.println(nameInCamelCase + " ends with Suj : "+nameInCamelCase.endsWith("Suj"));
		//9. int hashCode(): It returns the hash code of the string.
		System.out.println();
		System.out.println("hashCode Method");
		System.out.println("Hashcode of the string "+nameInCamelCase+" is "+nameInCamelCase.hashCode());
		//10. int indexOf(int ch): Returns the index of first occurrence of the specified character ch in the string.
		//11. int indexOf(int ch, int fromIndex): Same as indexOf method however it starts searching in the string from the specified fromIndex.
		//12. int indexOf(String str): This method returns the index of first occurrence of specified substring str.
		System.out.println();
		System.out.println("indexOf Method");
		System.out.println("Index of S in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf('S'));
		System.out.println("Index of j in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf('j'));
		System.out.println("Index of M in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf('M'));
		System.out.println("Index of j after 3rd char in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf('j',3));
		System.out.println("Index of t after 5th char in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf('t',5));
		System.out.println("Index of Majety in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf("Majety"));
		System.out.println("Index of Sujit in "+nameInCamelCase + " is : "+nameInCamelCase.indexOf("Sujit"));
		//13. int lastIndexOf(int ch): It returns the last occurrence of the character ch in the string.
		//14. int lastIndexOf(int ch, int fromIndex): Same as lastIndexOf(int ch) method, it starts search from fromIndex.
		//15. int lastindexOf(String str): Returns the index of last occurrence of string str.
		String str1 = new String("This is a CoreJava tutorial");
		String str2 = new String("Core");
		System.out.println();
		System.out.println("lastIndexOf Method");
		System.out.println("Last Index of a in '"+str1 + "' is : "+str1.lastIndexOf('a')); 
		System.out.println("Last Index of a in '"+str1 + "' whose index is <=18 is : "+str1.lastIndexOf('a',18)); 
		System.out.println("Last Index of a in '"+str1 + "' whose index is <=30 is : "+str1.lastIndexOf('a',30)); 
		System.out.println("Last Index of Core in '"+str1 + "' is : "+str1.lastIndexOf(str2)); 
		System.out.println("Last Index of Core in '"+str1 + "' before 15 is : "+str1.lastIndexOf(str2,15)); 
		//Homework
		//16. String substring(int beginIndex): It returns the substring of the string. The substring starts with the character at the specified index.
		//17. String substring(int beginIndex, int endIndex): Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.
		System.out.println();
		System.out.println("subString Method");
		System.out.println("Substring of '"+word+"' from 5 is "+word.substring(5));
		System.out.println("Substring of '"+word+"' from 2 to 4 is "+word.substring(2,4));
		//18. String concat(String str): Concatenates the specified string “str” at the end of the string.
		str1 = " and Strong.";
		System.out.println();
		System.out.println("conCat Method");
		System.out.println("Concatenating '"+word+"' with '"+str1+"' we get : "+word.concat(str1));
		//19. String replace(char oldChar, char newChar): It returns the new updated string after changing all the occurrences of oldChar with the newChar.
		str1 = "xx xxx xx xxxx xx yy";
		System.out.println();
		System.out.println("replace Method");
		System.out.println(str1+ " after replacing x with X we get : "+str1.replace('x', 'X'));
		//20. boolean contains(CharSequence s): It checks whether the string contains the specified sequence of char values. If yes then it returns true else false. 
		System.out.println();
		System.out.println("contains Method");
		System.out.println(word+ " contains 'Invincible' : "+word.contains("Invincible"));
		System.out.println(word+ " contains 'Sujit' : "+word.contains("Sujit"));
		//21. String toUpperCase(): Equivalent to toUpperCase(Locale.getDefault()).
		System.out.println();
		System.out.println("toUpperCase Method");
		System.out.println(word+" in uppercase: "+word.toUpperCase());
		//22. public String intern(): This method searches the specified string in the memory pool and if it is found then it returns the reference of it, 
		//else it allocates the memory space to the specified string and assign the reference to it.
		//Java automatically interns String literals ie. when we create multiple strings using literal method java will automatically intern's them.
		System.out.println();
		System.out.println("intern Method");
		String myString = new String("I Am Invincible").intern();
		String myString1 = new String("I Am Invincible");
		System.out.println("myString == word : "+(word==myString));
		System.out.println("myString == word : "+(word==myString1));
		//23. public boolean isEmpty(): This method returns true if the given string has 0 length. If the length of the specified Java String is non-zero then it returns false.
		System.out.println();
		System.out.println("Empty Method");
		String str4 = new String();
		System.out.println("Is word empty? : "+word.isEmpty());
		System.out.println("Is str4 empty? : "+str4.isEmpty());
		//24. public static String join(): This method joins the given strings using the specified delimiter and returns the concatenated Java String
		System.out.println();
		System.out.println("Join Method");
		String message = String.join("-", "This", "is", "a", "String");
		System.out.println("message : "+message);
		//25. String replaceFirst(String regex, String replacement): It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
		str1 = "www.sujitmajety.com.com";
		System.out.println();
		System.out.println("ReplaceFirst Method");
		System.out.println(str1+" is changed to "+str1.replaceFirst("com","net"));
		//26. String replaceAll(String regex, String replacement): It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string.
		str1 = "my .com site is www.sujitmajety.com";
		System.out.println();
		System.out.println("ReplaceAll Method");
		System.out.println(str1+" is changed to "+str1.replaceAll("com","net"));
		//27. String[] split(String regex): Same as split(String regex, int limit) method however it does not have any threshold limit.
		//28. String[] split(String regex, int limit): It splits the string and returns the array of substrings that matches the given regular expression. limit is a result threshold here.
		str1 = "31/08/2020";
		String arr1[] = str1.split("/");
		String arr2[] = str1.split("/",2);
		System.out.println();
		System.out.println("Split Method");
		System.out.println(arr1[0]+" and "+arr1[1]+" and "+arr1[2]);
		System.out.println(arr2[0]+" and "+arr2[1]);
		//29. public static String format(): This method returns a formatted java String
		str1 = "Just a String";
		String formattedString1 = String.format("My string is %s", str1);
		String formattedString2 = String.format("My Decimal is is %.2f", 12.566);
		System.out.println();
		System.out.println("Format Method");
		System.out.println(formattedString1);
		System.out.println(formattedString2);
		//30. String toLowerCase(): Equivalent to toLowerCase(Locale. getDefault()).
		System.out.println();
		System.out.println("toLowerCase Method");
		System.out.println(word+" in lowercase: "+word.toLowerCase());
		//31. String trim(): Returns the substring after omitting leading and trailing white spaces from the original string.
		str1 = "     I am Sujit Majety       ";
		System.out.println();
		System.out.println("Trim Method");
		System.out.println("Taken String will be : "+str1+".");
		System.out.println("The Trimmed String will be : "+str1.trim()+".");
		//32. char[] toCharArray(): Converts the string to a character array.
		str1 = "Welcome to All";
		char arr3[] = str1.toCharArray();
		System.out.println();
		System.out.println("toCharArray Method");
		for(char c : arr3)
			System.out.println(c);
		//33. static String copyValueOf(char[] data): It returns a string that contains the characters of the specified character array.
		//34. static String copyValueOf(char[] data, int offset, int count): Same as above method with two extra arguments – initial offset of subarray and length of subarray.
		System.out.println();
		System.out.println("CopyValueOf Method");
		str1 = String.copyValueOf(arr3);
		System.out.println("Merging the char array: "+str1);
		str1 = String.copyValueOf(arr3, 4, 3);
		System.out.println("Merging the char array with offset: "+str1);
		//35. void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin): It copies the characters of src array to the dest array. Only the specified range is being copied(srcBegin to srcEnd) to the dest subarray(starting fromdestBegin).
		str1 = "Welcome to Majety's World";
		char[] arr4 = new char[6];
		str1.getChars(11, 17, arr4, 0);
		System.out.println();
		System.out.println("getChars Method");
		for(char c: arr4)
			System.out.println(c);
		//36. static String valueOf(): This method returns a string representation of passed arguments such as int, long, float, double, char and char array.
		int number = 40;
		float decimal = 42.4f;
		System.out.println();
		System.out.println("valueOf Method");
		System.out.println(number+99);
		System.out.println(String.valueOf(number)+99);
		System.out.println(decimal+6.2);
		System.out.println(String.valueOf(decimal)+99);
		//37. boolean contentEquals(StringBuffer sb): It compares the string to the specified string buffer.
		str1 = "Sujit Majety";
		StringBuffer sb = new StringBuffer("Sujit Majety");
		System.out.println();
		System.out.println("contentEquals Method");
		System.out.println("str1 contains the same as sb: "+str1.contentEquals(sb));
		//38. boolean regionMatches(int srcoffset, String dest, int destoffset, int len): It compares the substring of input to the substring of specified string.
		//39. boolean regionMatches(boolean ignoreCase, int srcoffset, String dest, int destoffset, int len): Another variation of regionMatches method with the extra boolean argument to specify whether the comparison is case sensitive or case insensitive.
		//ignoreCase– if true, ignore case when comparing characters. 	toffset – the starting offset of the subregion in this string.  other – the string argument.
		//ooffset – the starting offset of the subregion in the string argument.  len – the number of characters to compare.
		str1 = "Hello, How are you";
		str2 = "How";
		String str3 = "how";
		System.out.println();
		System.out.println("RegionMatches Method");
		System.out.println("Substring of str1 matches with str2 : "+str1.regionMatches(7, str2, 0, 3));
		System.out.println("Substring of str1 matches with str3 : "+str1.regionMatches(7, str3, 0, 3));
		System.out.println("Substring of str1 matches with str3 ignoring case : "+str1.regionMatches(true, 7, str3, 0, 3));
		//40. byte[] getBytes(): This method is similar to the above method it just uses the default charset encoding for converting the string into sequence of bytes.
		//41. byte[] getBytes(String charsetName): It converts the String into sequence of bytes using the specified charset encoding and returns the array of resulted bytes.
		//This is similar to getChars method and the only difference is bytes instead of chars
		//42. int length(): It returns the length of a String.
		str1 = "Sujit";
		str2 = "Sujit Majety";
		System.out.println();
		System.out.println("length Method");
		System.out.println("Length of "+str1+"+ is "+str1.length());
		System.out.println("Length of "+str2+"+ is "+str2.length());
		//43. boolean matches(String regex): It checks whether the String is matching with the specified regular expression regex.
		str1 = "sujit.majety@gmail.com";
		str2 = "9000019878";
		str3 = "90000019878";
		System.out.println();
		System.out.println("matches Method");
		System.out.println(str1+" is a valid email: "+str1.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$"));
		System.out.println(str2+" is a valid phone number: "+str2.matches("^[0-9]{10}$"));
		System.out.println(str3+" is a valid phone number: "+str3.matches("^[0-9]{10}$"));
		//44. int codePointAt(int index):It is similar to the charAt method however it returns the Unicode code point value of specified index rather than the character itself.
		System.out.println();
		System.out.println("codePointAt Method");
		System.out.println(str1.codePointAt(1));
	}

}
