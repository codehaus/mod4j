package org.mod4j.dslcommon.openarchitectureware;

import org.openarchitectureware.workflow.issues.Issue;

public class Mod4jWorkflowException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1286074961964414319L;

    private Issue[] errors;

    public Mod4jWorkflowException(Issue[] errors) {
        this.errors = errors;
    }

    @Override
    public String getMessage() {

        String message = "";
        for (Issue issue : errors) {
            message += issue.getMessage() + "\r\n";
        }
        return message;
    }

}
