package Lambda;

public interface Algoritm {
    int function(int element);
}

class Func1 implements  Algoritm{

    @Override
    public int function(int element) {
        return 5*element*element +3*element+1;
    }
}

class Func2 implements  Algoritm{

    @Override
    public int function(int element) {
        return 5*element +element+1;
    }
}
