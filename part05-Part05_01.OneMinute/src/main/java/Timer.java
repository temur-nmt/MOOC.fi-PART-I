public class Timer {
    private ClockHand hundredsOfASecond;
    private ClockHand seconds;

    public Timer() {
        this.hundredsOfASecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredsOfASecond.advance();

        if (this.hundredsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return this.seconds.toString() + ":" + this.hundredsOfASecond.toString();
    }
}
