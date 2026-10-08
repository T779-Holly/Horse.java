public class Horse {
    String name;          // current name of the horse
    int birthYear;        // year the horse was born
    String[] names;       // array of old names of the horse
    int numberofNames = 0; // how many old names are there.

    public Horse(String horseName, int year) { 
        name = horseName; 
        birthYear = year; 
        names = new String[3]; // holds up to 3 old names
    }
    
    public void age() {
       
        int currentAge = 2026 - birthYear; 
        System.out.println(name + " is " + currentAge + " years old.");
    } 

    public void changeName(String newName) {
        names[numberofNames] = name;
        numberofNames++;
        name = newName;
    }

    public String toString() {
        return "Horse Name: " + name;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("Spirit", 2018);
        Horse horse2 = new Horse("Thunder", 2020);
        Horse horse3 = new Horse("Shadow", 2015);

        System.out.println(horse1);
        System.out.println(horse2);
        System.out.println(horse3);
    }
}
