package Week3.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

import Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry;

import java.util.*;

/**
 * Contains all the address book entries.
 * 
 * @author ...
 */
public class AddressBook
{
    private HashMap<String, Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry> addresses;

    public AddressBook() {
        this.addresses = new HashMap<>();
    }

    public void addAddress (String name, Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry entry) {
        addresses.put(name, entry);
    }

    public Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry findAddress (String name) {
        return addresses.get(name);
    }


    // Searche for an entry in the address book based on the given email address
    public Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry findName(String email) {
        Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry foundEntry = null;

        for (Map.Entry<String, Entry> entry : addresses.entrySet()) {
            if (entry.getValue().findAddress(email)) {
                foundEntry = entry.getValue();
            }
        }
        return foundEntry;
    }
}
