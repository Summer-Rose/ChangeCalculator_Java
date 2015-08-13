import org.junit.*;
import static org.junit.Assert.*;

public class AppUnitTest {

  @Test
  public void isAmountGreaterThanTwentyFive_true() {
    //
  }

  @Test
  public void calculateCoins_userInputReturnsAmountInPennies_5() {
    CoinCalculator testCoinCalculator = new CoinCalculator();
    String results =  "0 Quarter(s), 0 Dime(s), 0 Nickel(s), and 5 Pennie(s)";
    assertEquals(results, testCoinCalculator.calculateCoins(5));
  }
  // @Test
  // public void checkWinner_rockBeatsScissors_true() {
  //   RockPaperScissors testResult = new RockPaperScissors();
  //   assertEquals("Player One Wins", testResult.isWinner("Rock", "Scissors"));

}
