package transport.exeptions;

public class NoDriverLicenseException extends Exception {
    public NoDriverLicenseException(String message) {
        super(message);
    }
}