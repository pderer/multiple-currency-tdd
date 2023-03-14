package Money;

class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    void addRate(String to, String from, int rate) {

    }

}
