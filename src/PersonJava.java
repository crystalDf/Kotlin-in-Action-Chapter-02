public class PersonJava {

    private final String name;
    private boolean married;

    public PersonJava(String name, Boolean married) {
        this.name = name;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
