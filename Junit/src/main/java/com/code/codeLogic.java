package com.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class codeLogic {

	public int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	public String getValue(int key) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "ABC");
		map.put(102, "XYZ");
		return map.get(key);
	}

	public String getString() {
		return "Hello";
	}
	public void printStringLength(String str) {
		System.out.println(str.length());
	}

	public int[] sortArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
}
