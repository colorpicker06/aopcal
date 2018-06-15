package kr.hs.emirim.rlathfdl463.main;

import kr.hs.emirim.rlathfdl463.aopcal.cal.Calculator;
import kr.hs.emirim.rlathfdl463.aopcal.cal.ImpCalculator;
import kr.hs.emirim.rlathfdl463.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		
		ImpCalculator call = new ImpCalculator();
		long f1 = call.factorial(4);
		System.out.println("Imp 100 : "+f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(4);		
		System.out.println("Rec 100 : "+f2);

	}

}
