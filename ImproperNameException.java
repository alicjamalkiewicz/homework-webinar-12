package pl.test.ExceptionExamples;

public class ImproperNameException extends Exception{
    
    private String name;
    
    public ImproperNameException(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
