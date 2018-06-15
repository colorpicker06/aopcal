package kr.hs.emirim.rlathfdl463.main;

import kr.hs.emirim.rlathfdl463.aopcal.cal.Calculator;
import kr.hs.emirim.rlathfdl463.aopcal.cal.ImpCalculator;
import kr.hs.emirim.rlathfdl463.aopcal.cal.RecCalculator;

public class MainCal {
	
public static void main(String[] args) {
	
		long num = 10000;
		
		long start1 = System.currentTimeMillis();		
		ImpCalculator call = new ImpCalculator();
		long f1 = call.factorial(num);
		long end1 = System.currentTimeMillis();
		System.out.printf("Tmp factorial(%d): 실행시간 %d",num, (end1-start1));
		
		System.out.println();
		
		long start2 = System.currentTimeMillis();		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);	
		long end2 = System.currentTimeMillis();
		System.out.printf("Tmp factorial(%d): 실행시간 %d",num, (end2-start2));
	}


}
