package kr.hs.emirim.rlathfdl463.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.emirim.rlathfdl463.aopcal.cal.Calculator;
import kr.hs.emirim.rlathfdl463.aopcal.config.JavaConfig;

public class MainJavaAspect {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Calculator impCal = ctx.getBean("impCal",Calculator.class);
		long fiveFact1 = impCal.factorial(5);
		System.out.println("impCal.factorial(5)="+fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal",Calculator.class);
		long fiveFact2 = impCal.factorial(5);
		System.out.println("recCal.factorial(5)="+fiveFact2);

	}

}
