package Week1.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

import java.util.*;
        
/**
 * Represents a single address book entry.
 * 
 * @author ...
 */
public class Entry 
{
    private String name;
    private ArrayList<String> addresses;

    public Entry(String name, ArrayList<String> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public String getAddress(int i) {
        return addresses.get(i);
    }

    public boolean findAddress(String email) {
        boolean found = false;
        for (String e : addresses) {
            if (e.equals((email))) {
                found = true;
            }
        }
        return found;
    }

    public String toString() {
        StringBuilder info = new StringBuilder();
        for (String address : addresses) {
            info.append(": ").append(address);
        }
        return name + " " + info;
    }
}
