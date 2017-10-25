package com.pack2;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		Double s1 = e1.getSal();
		Double s2 = e2.getSal();
		return s1.compareTo(s2);
	}

}
