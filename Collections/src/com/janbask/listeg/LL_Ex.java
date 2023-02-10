package com.janbask.listeg;

import java.util.LinkedList;
import java.util.List;

public class LL_Ex {

	public static void main(String[] args) {
		
		
		List<String> Stud = new LinkedList<String>();
		Stud.add("Mark");
		Stud.add("Steve");
		Stud.add("Henry");
		Stud.add("Bob");
		Stud.add("Lee");
		Stud.add("Andy");
		Stud.add("Rob");
		
		
		System.out.println(Stud.size());
		
		System.out.println(Stud.get(0));
		
		
		for(int i=0;i<Stud.size();i++) {
			
			System.out.println(Stud.get(i));
		}
		

	}

}
