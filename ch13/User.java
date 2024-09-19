package gr.aueb.cf.ch13;

/**
 * Creates a user {@link User}, with the following
 * characteristics:
 * {@link #id}, {@link #firstname} and {@link #lastname}.
 * It also contains the default Constructor and the overloaded Constructor.
 *Finally, it contains the setters ({@link #setId(Long)} {@link #setFirstname(String)}
 * and {@link #setLastname(String)}) and the getters ({@link #getId()} {@link #getFirstname()}
 *  * and {@link #setLastname(String)})
 *
 * @author paris
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Default Constructor
     */
    public User () {
    }

    /**
     * Overloaded Constructor
     *
     * @param id        user's id
     * @param firstname user's first name
     * @param lastname  user's last name
     */
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Gets user's id
     *
     * @return user's id
     */
    public Long getId() {
        return id;
    }

    /**
     * sets user's id
     *
     * @param id  user's id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets user's first name
     *
     * @return user's firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * sets user's first name
     *
     * @param firstname  user's first name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Gets user's last name
     *
     * @return user's last name
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * sets user's last name
     *
     * @param lastname  user's last name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
