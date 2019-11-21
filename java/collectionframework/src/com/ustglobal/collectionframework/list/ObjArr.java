package com.ustglobal.collectionframework.list;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class ObjArr {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(15);
		al.add(15.53);
		al.add(true);
		al.add('A');
		al.add(null);
		
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}
