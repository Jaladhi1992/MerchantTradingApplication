package trading.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is simple configuration for each signal number
 */
public class Signal {

	/**
	 *  Map consisting signal configuration according to signal 
	 */
	private static Map<Integer, Runnable> signalMap = new HashMap<Integer, Runnable>();
	/**
	 * Capacity of number of signals can be processed by application 
	 * Value of capacity needs to be updated/increased when a new signal configuration is added
	 */
	private static int signalCapacity = 3;

	/**
	 * This constructor initializes map with signal configuration
	 */
	public Signal() {
		Algo algo = new Algo();
		signalMap.put(1, () -> {
			algo.setUp();
			algo.setAlgoParam(1, 60);
			algo.performCalc();
			algo.submitToMarket();
			
		});
		signalMap.put(2, () -> {
			algo.reverse();
			algo.setAlgoParam(1, 80);
			algo.submitToMarket();
		});
		signalMap.put(3, () -> {
			algo.setAlgoParam(1, 90);
			algo.setAlgoParam(2, 15);
			algo.performCalc();
			algo.submitToMarket();
		});
		
		
		/* In case if signal configuration is not available, this configuration should be used. */
		signalMap.put(signalCapacity + 1, () -> {
			algo.cancelTrades();
		});
		
		/* A common configuration, which needs to be called after any signal. */
		signalMap.put(signalCapacity + 2, () -> {
			algo.doAlgo();
		});
	}
	
	/**
	 * This method returns signal capacity
	 * @return signalCapacity
	 */
	protected int getSignalCapacity() {
		return signalCapacity;
	}
	
	/**
	 * This method returns map of signal configurations
	 * @return signalMap
	 */
	protected Map<Integer, Runnable> getSignalMap() {
		return signalMap;
	}
}
