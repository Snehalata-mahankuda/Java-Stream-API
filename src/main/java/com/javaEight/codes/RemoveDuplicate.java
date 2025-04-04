package com.javaEight.codes;
import java.util.*;
//import java.util.Arrays;
import java.util.stream.*;
//import java.util.stream.Collectors;
public class RemoveDuplicate
{
	public static void main(String[] args) {
		List<String> list = Arrays.asList("C","C++","Java","C","Java","Python");
		System.out.println("List ====== "+list);
		List<String> list1 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate Remove ====== "+list1);
	}
}