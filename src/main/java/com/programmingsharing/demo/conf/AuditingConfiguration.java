package com.programmingsharing.demo.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configurable
@EnableJpaAuditing
public class AuditingConfiguration {
	
	@Bean
	public AuditorAware<String> auditorAware(){
		return null;
	}

}
