package Week3.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

public class SearchByEmail extends Option{

    private AddressBook addressBook;

    public SearchByEmail(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

//    public SearchByEmail(AddressBook addressBook) {
//        super();
//    }

    @Override
    public String doOption(String s) {
        return addressBook.findName(s).toString();
    }
}
