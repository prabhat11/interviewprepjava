// Note: The StringBuilder method is more efficient and concise for reversing strings in Java.
// This method is preferred in practice for its simplicity and performance.
// The StringBuilder class is mutable, which means it can be modified without creating new objects,
// making it more efficient for operations like reversing strings compared to using character arrays.
// The StringBuilder class is part of the java.lang package and provides methods to manipulate strings efficiently.
// The reverse method of StringBuilder is a built-in method that reverses the characters in the StringBuilder object.
// It is a common practice to use StringBuilder for string manipulations in Java due to its performance benefits.
// The StringBuilder class is not synchronized, making it suitable for single-threaded applications.
// The StringBuilder class is widely used in Java for string manipulations, especially when performance is a concern.
// The StringBuilder class is often used in scenarios where multiple string operations are performed,
// such as concatenation, insertion, and deletion, due to its efficiency compared to immutable String objects.
// The StringBuilder class is a part of the Java Collections Framework, providing a flexible way to handle strings.
// The StringBuilder class is commonly
// used in Java for string manipulations, especially when performance is a concern.
package com.prabhat.string;

// Question: How do you reverse a string in Java?
// Explanation: This example reverses a string using a character array.
// It demonstrates both manual reversal and using StringBuilder for simplicity.
// Note: The StringBuilder method is more efficient and concise for reversing strings in Java.
public class StringReverse {
	public static String reverse(String s) {
		char[] arr = s.toCharArray();
		int left = 0, right = arr.length - 1;
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
	}

	// add reversing a string using StringBuilder
	// Explanation: StringBuilder provides a more concise way to reverse a string.
	public void reverseUsingStringBuilder(String s) {
		StringBuilder sb = new StringBuilder(s);
		System.out.println("Reverse of '" + s + "' using StringBuilder is '" + sb.reverse().toString() + "'");
	}

	public static void main(String[] args) {
		String str = "hello";
		System.out.println("Reverse of '" + str + "' is '" + reverse(str) + "'");
		// Using StringBuilder
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Reverse of '" + str + "' using StringBuilder is '" + sb.reverse().toString() + "'");
	}
}
