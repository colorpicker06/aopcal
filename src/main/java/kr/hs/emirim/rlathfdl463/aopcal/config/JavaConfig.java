package kr.hs.emirim.rlathfdl463.aopcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kr.hs.emirim.rlathfdl463.aopcal.aspect.ExetimeAspect2;
import kr.hs.emirim.rlathfdl463.aopcal.cal.Calculator;
import kr.hs.emirim.rlathfdl463.aopcal.cal.ImpCalculator;
import kr.hs.emirim.rlathfdl463.aopcal.cal.RecCalculator;

@Configuration
@EnableAspectJAutoProxy

public class JavaConfig {
	
	@Bean
	public ExetimeAspect2 exeTimeAspect() {
		return new ExetimeAspect2();
	}
	
	@Bean
	public Calculator impCal() {
		return new ImpCalculator();
	}
	
	
	@Bean
	public Calculator recCal() {
		return new RecCalculator();
	}

}
