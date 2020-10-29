import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExchangeIgnodTest {

	@Test
	void exchangeIgnodShouldGiveThreeIgnodsTest() {
		Ignod ignodToExchange = new Ignod(12);
		Bank exchangeBank = new Bank();
		Ignod[] exchangedIgnods = exchangeBank.exchangeIgnod(ignodToExchange);
		assertThat(exchangedIgnods.length).isEqualTo(3);
	}
}
