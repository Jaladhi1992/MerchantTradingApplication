package trading.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import trading.controller.Application;
import trading.controller.SignalHandler;

@Configuration
public class TradingConfiguration {
	
	
	@Bean
	public SignalHandler signalHandler() 
	{ 
		SignalHandler signalHandler = new Application();
		return signalHandler;		
	}

}
