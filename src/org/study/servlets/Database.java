package org.study.servlets;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private static List<Office> list = new ArrayList<>();
	
	static {
		list.add(new Office(1, "Office 1"));
	}

	public void add(Office office) {
		list.add(office);
	}
	
	public List<Office> getOffices() {
		return Database.list;
	}

}
