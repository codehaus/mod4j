package org.mod4j.dslcommon.openarchitectureware;

public class Mod4jWorkflowException extends Exception {

    /**
     * Serializable need
     */
    private static final long serialVersionUID = 1286074961964414319L;

    private String message;

    public Mod4jWorkflowException(String string) {
        setMessage(string);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
