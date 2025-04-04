class Authenticator {

    public boolean authenticate(String username, String password) {
        return username.equals("user") && password.equals("pass123");
    }

    public boolean authenticateByEmail(String email, String password) {
        return email.equals("user@example.com") && password.equals("pass123");
    }

    public boolean authenticate(String username, String password, int otp) {
        return username.equals("user") && password.equals("pass123") && otp == 456789;
    }
}

public class UserAuthentication {
    public static void main(String[] args) {
        Authenticator auth = new Authenticator();

        System.out.println("Authentication (username/password): " + auth.authenticate("user", "pass123"));

        System.out.println("Authentication (email/password): " + auth.authenticateByEmail("user@example.com", "pass123"));

        System.out.println("Authentication (username/password/OTP): " + auth.authenticate("user", "pass123", 456789));
    }
}
