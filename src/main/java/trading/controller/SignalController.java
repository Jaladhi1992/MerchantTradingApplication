package trading.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/" })
public class SignalController {

	@Autowired
	private ApplicationContext context;	

	@GetMapping({ "processSignal" })
	public String processSignal(@RequestParam int signal) {
		String response = "";
		try {
			SignalHandler signalHandler = (SignalHandler) context.getBean("signalHandler");
			signalHandler.handleSignal(signal);
			response = signal + " signal processed successfully.";
		} catch (Exception ex) {
			response = "Signal could not be processed.";
		}
		return response;

	}
}
