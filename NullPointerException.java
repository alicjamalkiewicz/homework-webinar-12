package pl.test.ExceptionExamples;

public class NullPointerException extends Exception{

    private String name;

    public NullPointerException(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
