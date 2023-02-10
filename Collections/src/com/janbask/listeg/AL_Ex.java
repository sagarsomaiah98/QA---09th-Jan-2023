package com.janbask.listeg;

import java.util.ArrayList;
import java.util.List;

public class AL_Ex {

	public static void main(String[] args) {
		
		
		List<String> Stud= new ArrayList<String>();
		
		Stud.add("Mark");
		Stud.add("Steve");
		Stud.add("Henry");
		Stud.add("Bob");
		Stud.add("Lee");
		Stud.add("Andy");
		Stud.add("Rob");
		
		
		System.out.println(Stud.size());
		
		//System.out.println(Stud.get(3));
		
		
		for(int i=0;i<Stud.size();i++) {
			
			System.out.println(Stud.get(i));
		}
		
	}

}
