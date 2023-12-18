package com.leedcode.string;

public class FindIndexFirstOccurrence {
	private static int strStr(String haystack, String needle) {
		if (haystack.isEmpty() || needle.isEmpty())
			return -1;

		if (haystack.length() < needle.length() || !haystack.contains(needle))
			return -1;

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i + needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strStr("", "");
	}

}
