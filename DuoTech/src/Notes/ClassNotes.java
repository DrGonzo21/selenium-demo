package Notes;

public class ClassNotes {
    String str = "hello";
    // only things allowed in a class
    // Fields -> String str = "hello";
    // Constructors -> ClassNotes();
    // Methods -> public static void main(String [] args){}
    public static void main(String[] args) {
        ClassNotes note; //-> reference variable -> stack memory
        new ClassNotes(); // anonymous object that doesn't have a reference -> heap memory
        ClassNotes my = new ClassNotes(); //-> connects heap memory to the stack memory
        System.out.println(new ClassNotes().str);
    }
}
