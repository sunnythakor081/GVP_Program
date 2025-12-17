package ChainOfResponsibility.mydemo;

public class ClassTeacher implements LeaveApprover {
    private LeaveApprover next;

    @Override
    public void setNextApprover(LeaveApprover next) {
        this.next = next;
    }

    @Override
    public void approveLeave(LeaveRequest request) {
        if (request.getDays() <= 2) {
            System.out.println("Class Teacher approved leave for " + request.getDays() + " days.");
        } else if (next != null) {
            next.approveLeave(request);
        }
    }
}
