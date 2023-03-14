package Money;

import java.util.Hashtable;

class Bank {
    private Hashtable rates = new Hashtable();
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), Integer.valueOf(rate));
    }

    int rate(String from, String to) {
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
