package trading.controller;

/**
 *SignalHandler interface can be implemented for processing signal 
 */
public interface SignalHandler {
	
	/**
	 * This method processes signal 
	 * @param signal
	 */
	void handleSignal(int signal);
}
