import java.util.Date;

public class Name {
    private String title;
    private String first;
    private String middle;
    private String surname;
    private String surnameParent1;
    private String surnameParent2;
    private String suffixGenerational; // e.g., III, Jr., Sr., etc.
    private String suffixProfessional; // e.g., Ph.D., CPA, etc.

    public Name (
                 String title,
                 String first,
                 String middle,
                 String surname,
                 String surnameParent1,
                 String surnameParent2,
                 String generational,
                 String professional
                 ) {
        this.title = title;
        this.first = first;
        this.middle = middle;
        this.surname = surname;
        this.surnameParent1 = surnameParent1;
        this.surnameParent2 = surnameParent2;
        this.suffixGenerational = generational;
        this.suffixProfessional = professional;
    }

    public String getTitle() {
		return title;
        /* return name's title */
    }

    public String getFirst() {
       return first; /* return Name's first name */
    }

    public String getMiddle() {
       return middle; /* return Name's middle name */
    }

    public String getSurname() {
       return surname; /* return Name's last name */
    }

    public String getSurnameParent1() {
        return surnameParent1;/* return parent1's last name */
    }

    public String getSurnameParent2() {
        return surnameParent2;/* return parent2's last name */
    }

    public String getSuffixProfessional() {
    	return suffixProfessional;/* return Name's professional suffix */
    }

    public String getSuffixGenerational() {
        return suffixGenerational;/* return Name's generational suffix */
}
}
