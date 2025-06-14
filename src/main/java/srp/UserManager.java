//import java.util.regex.Pattern;
package srp;


public class UserManager {
    /*
     * public void addUser(String email, String password) {
     * if (isValidEmail(email) && isValidPassword(password)) {
     * saveToDatabase(email, password);
     * sendWelcomeEmail(email);
     * } else {
     * System.out.println("Invalid email or password. User not added.");
     * }
     * }
     * 
     * private boolean isValidEmail(String email) {
     * return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
     * }
     * 
     * private boolean isValidPassword(String password) {
     * return password.length() >= 8;
     * }
     * 
     * private void saveToDatabase(String email, String password) {
     * System.out.println("Saving user to the database...");
     * System.out.println("Email: " + email);
     * System.out.println("Password: " + password);
     * }
     * 
     * private void sendWelcomeEmail(String email) {
     * System.out.println("Sending welcome email to " + email);
     * }
     */
    private final UserValidator validator;
    private final UserRepository repository;
    private final NotificationService notificationService;

    public UserManager() {
        this.validator = new UserValidator();
        this.repository = new UserRepository();
        this.notificationService = new NotificationService();
    }

    public void addUser(String email, String password) {
        if (validator.isValidEmail(email) && validator.isValidPassword(password)) {
            repository.save(email, password);
            notificationService.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}




