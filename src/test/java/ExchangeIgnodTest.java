import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExchangeIgnodTest {

	@Test
	void exchangeIgnodShouldGiveThreeIgnodsTest() {
		Ignod ignodToExchange = new Ignod(12);
		Bank exchangeBank = new Bank();
		Ignod[] exchangedIgnods = exchangeBank.exchangeIgnod(ignodToExchange);
		assertThat(exchangedIgnods.length).isEqualTo(3);
		assertThat(exchangedIgnods[0].getIgnodValue()).isEqualTo(6);
		assertThat(exchangedIgnods[1].getIgnodValue()).isEqualTo(4);
		assertThat(exchangedIgnods[2].getIgnodValue()).isEqualTo(3);
	}

	@Test
	void exchangeIgnodShouldGiveThreeIgnodsTestLowValue() {
		Ignod ignodToExchange = new Ignod(2);
		Bank exchangeBank = new Bank();
		Ignod[] exchangedIgnods = exchangeBank.exchangeIgnod(ignodToExchange);
		assertThat(exchangedIgnods.length).isEqualTo(3);
		assertThat(exchangedIgnods[0].getIgnodValue()).isEqualTo(1);
		assertThat(exchangedIgnods[1].getIgnodValue()).isEqualTo(0);
		assertThat(exchangedIgnods[2].getIgnodValue()).isEqualTo(0);
	}
}
