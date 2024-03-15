package Week3.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

public class SearchByName extends Option{

    private AddressBook addressBook;

    public SearchByName(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public SearchByName(Week2.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook.AddressBook addressBook) {
        super();
    }

    @Override
    public String doOption(String s) {
        return addressBook.findAddress(s).toString();
    }
}
