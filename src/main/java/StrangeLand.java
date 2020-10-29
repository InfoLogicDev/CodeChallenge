import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class StrangeLand {
	private Bank bank;

	public StrangeLand(Bank bank) {
		this.bank = bank;
	}

	public static void main(String[] args) {
		Instant start = Instant.now();
		StrangeLand strangeLand = new StrangeLand(new Bank());
		getIgnodsFromFile(args).forEach(ignod ->
				System.out.println("Max amount of eur for Ignod: "+ ignod.getIgnodValue() +" is " + strangeLand.getBestEurValueForIgnod(ignod)));
		System.out.println("Total duration : " +  (Instant.now().getNano() - start.getNano()) );
	}

	private static List<Ignod> getIgnodsFromFile(String[] args) {
		List<Ignod> ignods= new ArrayList<>();

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(args[0]));
			String line = reader.readLine();
			while (line != null) {
				ignods.add(new Ignod(Integer.parseInt(line)));
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ignods;
	}

	public int getBestEurValueForIgnod(Ignod ignod){
		return bank.maxEurForIgnod(ignod);
	}
}
