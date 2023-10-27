package seedu.address.model.property;

import java.util.function.Predicate;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.model.property.Property;

/**
 * Tests that a {@code Customer} is same with the given customer.
 */
public class SamePropertyPredicate implements Predicate<Property> {

    private final Property property;

    /**
     * Constructs a {@code SamePropertyPredicate}.
     *
     * @param property the specified property
     */
    public SamePropertyPredicate(Property property) {
        this.property = property;
    }

    @Override
    public boolean test(Property targetProperty) {
        return property.equals(targetProperty);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof SamePropertyPredicate)) {
            return false;
        }

        SamePropertyPredicate otherSameCustomerPredicate = (SamePropertyPredicate) other;
        return this.property == otherSameCustomerPredicate.property;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("Property", property).toString();
    }
}