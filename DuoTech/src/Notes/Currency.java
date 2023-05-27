package Notes;

public class Currency {

    public String name; // public -> visible by every other class
    int[] nominalValues; // -> default visibility (no modifier) -> visible in this package only (package private)

   protected String abbrev; // protected is more accessible than default
  private  char symbol; // private is only visible within that class, not accessible outside of the class
    boolean hasDigitalVersion;

    public Currency(String name, int[] nominalValues, String abbrev, char symbol, boolean hasDigitalVersion) {
        this.name = name;
        this.nominalValues = nominalValues;
        this.abbrev = abbrev;
        this.symbol = symbol;
        this.hasDigitalVersion = hasDigitalVersion;
    }
    public void exchange(){ //-> public

    }

    void spend(){ // -> default
     //static  or non static has no relation to the visibilty
    }
    protected void getInfo(){ //-> protected

    }
    private void doSomething(){ // private methods are usually used for internal opertaion
        // that outside class can't have access to

    }

}
