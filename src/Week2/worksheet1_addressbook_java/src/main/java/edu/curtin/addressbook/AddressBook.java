package Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

import java.util.*;

/**
 * Contains all the address book entries.
 * 
 * @author ...
 */
public class AddressBook
{
    private HashMap<String, Entry> addresses;

    public AddressBook() {
        this.addresses = new HashMap<>();
    }

    public void addAddress (String name, Entry entry) {
        addresses.put(name, entry);
    }

    public Entry findAddress (String name) {
        return addresses.get(name);
    }


    // Searche for an entry in the address book based on the given email address
    public Entry findName(String email) {
        Entry foundEntry = null;

        for (Map.Entry<String, Entry> entry : addresses.entrySet()) {
            if (entry.getValue().findAddress(email)) {
                foundEntry = entry.getValue();
            }
        }
        return foundEntry;
    }
}
