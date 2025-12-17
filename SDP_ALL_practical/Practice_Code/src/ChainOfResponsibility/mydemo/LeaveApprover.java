package ChainOfResponsibility.mydemo;

public interface LeaveApprover {

    void setNextApprover(LeaveApprover next);
    void approveLeave(LeaveRequest request);
}
