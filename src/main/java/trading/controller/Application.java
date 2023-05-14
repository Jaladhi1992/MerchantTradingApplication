package trading.controller;

import java.util.Map;



/**
 *The class provides actual implementation for handling signal
 */
public class Application implements SignalHandler {
		
	private static Map<Integer, Runnable> signalMap;
	private static int signalCapacity;
	Signal signal = new Signal();

	/**
	 * A constructor that initializes signal configuration from Signal class 
	 */
	public Application() {		
		signalMap = signal.getSignalMap();
		signalCapacity = signal.getSignalCapacity();
	}

	/**
	 *This method receives signal and processes according to requested signal number
	 *@param signal the signal number
	 */
	public void handleSignal(int signal) {
		
		if (signal > 0 && signal <= signalCapacity) {
			signalMap.get(signal).run();
			signalMap.get(signalCapacity + 2).run();
		} else {
			signalMap.get(signalCapacity + 1).run();
			signalMap.get(signalCapacity + 2).run();
		}
		
		
	}
}
