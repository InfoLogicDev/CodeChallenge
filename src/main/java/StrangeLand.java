import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class StrangeLand {
	private Bank bank;

	public StrangeLand(Bank bank) {
		this.bank = bank;
	}

	public static void main(String[] args) {
		StrangeLand strangeLand = new StrangeLand(new Bank());
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 0,strangeLand.getBestEurValueForIgnod(new Ignod(0))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 2,strangeLand.getBestEurValueForIgnod(new Ignod(2))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 12,strangeLand.getBestEurValueForIgnod(new Ignod(12))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 100,strangeLand.getBestEurValueForIgnod(new Ignod(100))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 400,strangeLand.getBestEurValueForIgnod(new Ignod(400))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 123456,strangeLand.getBestEurValueForIgnod(new Ignod(123456))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 654321,strangeLand.getBestEurValueForIgnod(new Ignod(654321))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 999999,strangeLand.getBestEurValueForIgnod(new Ignod(999999))));
		System.out.println(String.format("Mxx amount of eur for Ignod: %d  is %d ", 1000000000,strangeLand.getBestEurValueForIgnod(new Ignod(1000000000))));
	}

	public int getBestEurValueForIgnod(Ignod ignod){
		return bank.maxEurForIgnod(ignod);
	}
}
