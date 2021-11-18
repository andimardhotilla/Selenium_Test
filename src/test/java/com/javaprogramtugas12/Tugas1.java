package com.javaprogramtugas12;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {
	public static void main(String[] args)
    {

//	TREESET
	TreeSet<Integer> nilaiUjian = new TreeSet<>();
	nilaiUjian.add(90);
	nilaiUjian.add(40);
	nilaiUjian.add(50);
	nilaiUjian.add(70);
	nilaiUjian.add(75);
	nilaiUjian.add(60);
	nilaiUjian.add(80);
	nilaiUjian.add(55);
	nilaiUjian.add(100);
	
	nilaiUjian.remove(75);
	nilaiUjian.remove(55);
	
//	Nilai Set dari Terkecil ke Terbesar
	for (Integer item : nilaiUjian) {
		System.out.println(item);
	}
	
//	Nilai Set dari Terbesar ke Terkecil
	for (Integer item2 : nilaiUjian.descendingSet()) {
		System.out.println(item2);
	}
	
//	TREEMAP
	TreeMap <Integer, Integer> akarBilangan = new TreeMap<>();
	akarBilangan.put(27,3);
	akarBilangan.put(125,5);
	akarBilangan.put(8,2);
	akarBilangan.put(64,4);
	akarBilangan.put(1,1);
	
	for (Integer key : akarBilangan.keySet()) {
		System.out.println("Nilai " + key + " adalah akar pangkat 3 dari " + akarBilangan.get(key));
	}
	
	
    }
}
