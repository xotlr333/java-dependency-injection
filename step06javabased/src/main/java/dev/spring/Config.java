package dev.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Tape tape() {
		return new Tape("���Ϸ���", true);
	}
	
	@Bean
	public TapeReader tapeReader(Tape tape) {
		return new TapeReader(tape);
	}         
	
	

}
