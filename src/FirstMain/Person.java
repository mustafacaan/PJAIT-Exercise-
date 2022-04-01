
public class Person {
    private String name;
    private int birthYear;
    public Person(String name,int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public boolean isFemale() {
        return name.charAt(name.length()-1)=='a';
    }
    public String toString(){
        return "Name [" + this.name + "]";
    }


    }

