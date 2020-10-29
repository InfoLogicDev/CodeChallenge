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
}
