package Week3.worksheet1_addressbook_java.src.main.java.edu.curtin.addressbook;

import java.io.*;
import java.util.*;

/**
 * A simple address book application.
 * @author Dave and ...
 */
public class AddressBookApp 
{
    /** Used to obtain user input. */
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        String fileName;
        Scanner input = new Scanner(System.in);
        AddressBookApp addressBookApp = new AddressBookApp();

        System.out.print("Enter address book filename: ");
        fileName = input.nextLine();
        
        try
        {
            readAddressBook(fileName);
            showMenu();
        }
        catch(IOException e)
        {
            System.out.println("Could not read from " + fileName + ": " + e.getMessage());
        }
    }
    
    /**
     * Read the address book file, containing all the names and email addresses.
     *
     * @param fileName The name of the address book file.
     * @return A new AddressBook object containing all the information.
     * @throws IOException If the file cannot be read.
     */
    private static AddressBook readAddressBook(String fileName) throws IOException
    {
        AddressBook addressBook = new AddressBook();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line = reader.readLine();
            while(line != null)
            {
                String[] parts = line.split(":");
                                
                // FIXME: Insert your code here to add a new address book entry.
                // Note: 
                // parts[0] contains the person's name.
                // parts[1], parts[2], etc. contain the person's email address(es).

                ArrayList<String> emailAddress = new ArrayList<>(Arrays.asList(parts).subList(1, parts.length));

                Entry entry = new Entry(parts[0], emailAddress);

                addressBook.addAddress(parts[0], entry);
                
                line = reader.readLine();
            }
        }

        // Initializa the options for hashmap
        initOptions(addressBook);

        return addressBook;
    }

    // Initilize the HashMap storing the different options
    private static final Map<Integer, Option> options = new HashMap<>();

    // Set up the hashmap to point to the correct option for each key
    public static void initOptions(AddressBook addressBook) {
        options.put(1, new SearchByName(addressBook));
        options.put(2, new SearchByEmail(addressBook));
        options.put(3, new DisplayAll(addressBook));
    }

    // Add another option to the hashmap
    public void addOption(Integer i, Option option){
        options.put(i,option);
    }

    /**
     * Show the main menu, offering the user options to (1) search entries by
     * name, (2) search entries by email, or (3) quit.
     */
    private static void showMenu()
    {
        String searchTerm;
        int inTerm;
        Option option;
        boolean done = false;
        Scanner input = new Scanner(System.in);
        while(!done)
        {
            System.out.println("(1) Search by name, (2) Search by email, (3) Display ALl, (4) Quit");
            
            try {
                inTerm = Integer.parseInt(input.nextLine());
                if (inTerm == 4) {
                    done = true;
                } else {
                    // Get the option mapped to the user selection
                    option = options.get(inTerm);
                    if (option != null) {
                        searchTerm = "";

                        // Check if the selection requires a user input
                        if (option.requiresText()) {
                            System.out.println("Enter search term: ");
                            searchTerm = input.nextLine();
                        }

                        // at this level code does not know or car which version of doOption is running
                        System.out.println(option.doOption(searchTerm));
                    } else {
                        System.out.println("Enter a valid number !");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        }
    }
}
