package company.stream.foreach;

public class Price {
    int value;

    public Price(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                '}';
    }
}
