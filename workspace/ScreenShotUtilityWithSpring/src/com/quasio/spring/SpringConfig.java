package com.quasio.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ControllerConfig.class, ViewConfig.class, ModelConfig.class })
public class SpringConfig {

}
