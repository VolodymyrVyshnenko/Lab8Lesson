package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	System.out.println("1 Завдання");
	    ArrayList<String> al = new ArrayList<String>();
	    al.add("AUDI");
	    al.add("Alpha Romeo");
	    al.add("World");
		al.add("BMW");
		al.add("Ford");
		al.add("Fiat");
		al.add("Dodge");
		al.add("Lada");
		al.add("Volvo");
		al.add("Skoda");
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++)
		{
			// using method 'get'
			System.out.println(al.get(i));
		}
		System.out.println("2 Завдання");
		al.set(0, "0fly");
		al.set(1, "1fly");
		al.set(2, "2fly");
		al.set(3, "3fly");
		al.set(4, "4fly");
	    System.out.println(al.size());
	    for (int i = 0; i < al.size(); i++)
        {
            // using method 'get'
            System.out.println(al.get(i));
        }
		System.out.println("3 Завдання");
	    al.remove(0);
	    al.remove(0);
	    al.remove(7);
	    al.remove(6);
		System.out.println(al.size());
		for (int i = 0; i < al.size(); i++)
		{
			// using method 'get'
			System.out.println(al.get(i));
		}
		System.out.println("4 Завдання");
		al.add(3, ">");
		for (int i = 0; i < al.size(); i++)
		{
			// using method 'get'
			System.out.println(al.get(i));
		}
    }
}
