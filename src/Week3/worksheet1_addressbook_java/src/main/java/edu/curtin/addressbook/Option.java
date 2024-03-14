package Week3.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

public abstract class Option {
    public abstract String doOption (String s);

    public boolean requiresText() {
        return true;
    }
}
