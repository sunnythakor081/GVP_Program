package ChainOfResponsibility.mydemo;

public class Director implements LeaveApprover{
    @Override
    public void setNextApprover(LeaveApprover next) {

    }

    @Override
    public void approveLeave(LeaveRequest request) {
        System.out.println("Director approved leave for"+request.getDays()+ "days.");
    }
}
