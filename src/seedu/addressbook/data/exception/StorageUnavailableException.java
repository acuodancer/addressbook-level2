package seedu.addressbook.data.exception;

/**
 * Signals that the storage file is deleted while the program is still running.
 */
public class StorageUnavailableException extends Exception {
    /**
     * @param message should contain relevant information on the failed constraint(s)
     */
    public StorageUnavailableException(String message) {
        super(message);
    }
}
