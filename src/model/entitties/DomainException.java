package model.entitties;

public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public DomainException() {
    }

    public DomainException(String msg) {
        super(msg);
    }
}
