package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.customer.*;
import seedu.address.model.customer.Address;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Customer[] getSampleCustomers() {
        return new Customer[] {
            new Customer(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                100000,
                getTagSet("bright")),
            new Customer(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                999000,
                getTagSet("white", "square")),
            new Customer(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                40000000,
                getTagSet("neighbours")),
            new Customer(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                7600000,
                getTagSet("family")),
            new Customer(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                50000,
                getTagSet("small")),
            new Customer(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                200000,
                getTagSet("city-center"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Customer sampleCustomer : getSampleCustomers()) {
            sampleAb.addCustomer(sampleCustomer);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
