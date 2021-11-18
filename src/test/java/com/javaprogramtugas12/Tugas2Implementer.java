package com.javaprogramtugas12;

import java.util.ArrayList;
import java.util.HashSet;

public class Tugas2Implementer implements Tugas2I1, Tugas2I2{
	
	public void bilanganPertama() {
		System.out.println("x adalah " + x);
		System.out.println("y adalah " + y);
		System.out.println("z adalah " + z);
		System.out.println("a adalah " + a);
		System.out.println("t adalah " + t);
	}

	public void bilanganKedua() {
		System.out.println("x2 adalah " + x2);
		System.out.println("y2 adalah " + y2);
		System.out.println("z2 adalah " + z2);
		System.out.println("a2 adalah " + a2);
		System.out.println("t2 adalah " + t2);
		
	}
	
	public void penjumlahan() {
		System.out.println("x + x2 = " + (x + x2));
		System.out.println("y + y2 = " + (y + y2));
		System.out.println("z + z2 = " + (z + z2));
		System.out.println("a + a2 = " + (a + a2));
		System.out.println("t + t2 = " + (t + t2));
		
		try {
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
		
	public void penjumlahantiapnilai1dan2() {
		ArrayList<Integer> numbers1 = new ArrayList<>();
//		HashSet<Integer> numbers1 = new HashSet<>();
		numbers1.add(x);
		numbers1.add(y);
		numbers1.add(z);
		numbers1.add(a);
		numbers1.add(t);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
//		HashSet<Integer> numbers2 = new HashSet<>();
		numbers2.add(x2);
		numbers2.add(y2);
		numbers2.add(z2);
		numbers2.add(a2);
		numbers2.add(t2);
		
		for(Integer plus : numbers1) {
			System.out.println(plus);
			for (Integer plusb : numbers2) {
				System.out.println(plus + plusb);
			}
		}
	
	}
	
	public void pengurangan() {
		System.out.println("x - x2 = " + (x - x2));
		System.out.println("y - y2 = " + (y - y2));
		System.out.println("z - z2 = " + (z - z2));
		System.out.println("a - a2 = " + (a - a2));
		System.out.println("t - t2 = " + (t - t2));
		
		try {
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
		
	public void pengurangantiapnilai1dan2() {
		HashSet<Integer> numbers1 = new HashSet<>();
		numbers1.add(x);
		numbers1.add(y);
		numbers1.add(z);
		numbers1.add(a);
		numbers1.add(t);
		
		HashSet<Integer> numbers2 = new HashSet<>();
		numbers2.add(x2);
		numbers2.add(y2);
		numbers2.add(z2);
		numbers2.add(a2);
		numbers2.add(t2);
		
		for(Integer min : numbers1) {
			for (Integer minb : numbers2) {
				System.out.println(min - minb);
			}
		}
	}
	
	public void pengalian() {
		System.out.println("x * x2 = " + (x * x2));
		System.out.println("y * y2 = " + (y * y2));
		System.out.println("z * z2 = " + (z * z2));
		System.out.println("a * a2 = " + (a * a2));
		System.out.println("t * t2 = " + (t * t2));
		
		try {
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
		
	public void pengaliantiapnilai1dan2() {
		HashSet<Integer> numbers1 = new HashSet<>();
		numbers1.add(x);
		numbers1.add(y);
		numbers1.add(z);
		numbers1.add(a);
		numbers1.add(t);
		
		HashSet<Integer> numbers2 = new HashSet<>();
		numbers2.add(x2);
		numbers2.add(y2);
		numbers2.add(z2);
		numbers2.add(a2);
		numbers2.add(t2);
		
		for(Integer min : numbers1) {
			for (Integer minb : numbers2) {
				System.out.println(min * minb);
			}
		}
	}
	
	public void pembagian() {
		System.out.println("x : x2 = " + (x / x2));
		System.out.println("y : y2 = " + (y / y2));
		System.out.println("z : z2 = " + (z / z2));
		System.out.println("a : a2 = " + (a / a2));
		System.out.println("t : t2 = " + (t / t2));
		
		try {
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
		
	public void pembagiantiapnilai1dan2() {
		HashSet<Integer> numbers1 = new HashSet<>();
		numbers1.add(x);
		numbers1.add(y);
		numbers1.add(z);
		numbers1.add(a);
		numbers1.add(t);
		
		HashSet<Integer> numbers2 = new HashSet<>();
		numbers2.add(x2);
		numbers2.add(y2);
		numbers2.add(z2);
		numbers2.add(a2);
		numbers2.add(t2);
		
		for(Integer min : numbers1) {
			for (Integer minb : numbers2) {
				System.out.println(min/minb);
			}
		}
	}

}
