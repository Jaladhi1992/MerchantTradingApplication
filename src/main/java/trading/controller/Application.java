package trading.controller;


/**
 * The class provides actual implementation for handling signal
 */
public class Application implements SignalHandler {

	/**
	 * This method receives signal and processes according to requested signal
	 * number
	 * 
	 * @param signal the signal number
	 */
	public void handleSignal(int signal) {
		Algo algo = new Algo();
		switch (signal) {
		case 1:
			algo.setUp();
			algo.setAlgoParam(1, 60);
			algo.performCalc();
			algo.submitToMarket();
			break;
		case 2:
			algo.reverse();
			algo.setAlgoParam(1, 80);
			algo.submitToMarket();
			break;
		case 3:
			algo.setAlgoParam(1, 90);
			algo.setAlgoParam(2, 15);
			algo.performCalc();
			algo.submitToMarket();
			break;
		default:
			algo.cancelTrades();
			break;
		}
		algo.doAlgo();
	}
}
