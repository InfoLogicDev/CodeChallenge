public class Bank {

	public Ignod[] exchangeIgnod(Ignod ignodToExchange) {
		Ignod ignods[]=  new Ignod[3];
		ignods[0] = ignodDivider(ignodToExchange.getIgnodValue(), 2);
		ignods[1] = ignodDivider(ignodToExchange.getIgnodValue(), 3);
		ignods[2] = ignodDivider(ignodToExchange.getIgnodValue(), 4);
		return ignods;
	}

	private Ignod ignodDivider(int ignodValue, int div) {
		int divIgnodValue = Math.floorDiv(ignodValue, div);
		return new Ignod(divIgnodValue);
	}

	public int ignodEurValue(Ignod[] ignods) {
		int totalEuroValue=0;
		for(Ignod ignod:ignods ){
			totalEuroValue = totalEuroValue + ignod.getIgnodValue();
		}
		return totalEuroValue;
	}

	public int maxEurForIgnod(Ignod ignod){
		int ignodExchangedValue = ignodEurValue(exchangeIgnod(ignod));
		if (ignod.getIgnodValue() > ignodExchangedValue){
			return ignod.getIgnodValue();
		}
		return ignodExchangedValue;
	}

}
