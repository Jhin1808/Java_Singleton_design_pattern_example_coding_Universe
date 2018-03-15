package universe;

// STATIC means a Class Method or Class Variable that is callable without an instance of the class.
// I.e. PizzaShop.show_all ()  method was called on the class, not an object instance.

public class Universe {
    // NOTE 1 - A Singleton Class has a Static instance of itself, which is private, so no-one can access.
    private static Universe instance;

    public static final int speedOfLight = 29882934;

    private String name;
    private int numberOfGalaxies;

    // NOTE 2 - A Singleton Class Constructor is private, so can only be called by itself.
    //      Unlike all other class constructors we seen so far, which are public.
    private Universe(String name, int numberOfGalaxies) {
        this.name = name;
        this.numberOfGalaxies = numberOfGalaxies;
    }


    // NOTE 3 - A Singleton Class ALWAYS has method getInstance public Class method.
    // As a Class method, it is accessible before the object is created.
    public static Universe getInstance(String name, int numberOfGalaxies) {
        // This Method will only create ONE instance of itself.
        if(instance == null) {
            instance = new Universe(name, numberOfGalaxies);
        }
        return instance;
    }

 //  normal getters
    public String getName() {
        return this.name;
    }

    public int getNumberOfGalaxies() {
        return this.numberOfGalaxies;
    }

//    normal setter
    public void setName(String aNewName) {
        this.name = aNewName;
    }

}