package Week3.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

import Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.Entry;

import java.util.Map;

public class DisplayAll extends  Option{

    private AddressBook addressBook;

    public DisplayAll(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public DisplayAll(Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.AddressBook addressBook) {
        super();
    }

    @Override
    public String doOption(String s) {
       String rString = "";

       // Loop through all entries and add to string
        for (Map.Entry<String, Entry> entry : addressBook.getAddresses().entrySet()) {
            rString += entry.getValue() + "\n";
        }
        return rString;
    }

    @Override
    public boolean requiresText() {
        return false;
    }
}
