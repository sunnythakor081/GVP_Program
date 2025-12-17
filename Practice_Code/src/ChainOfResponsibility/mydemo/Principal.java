package ChainOfResponsibility.mydemo;

public class Principal implements LeaveApprover{
    private LeaveApprover next;

    @Override
    public void setNextApprover(LeaveApprover next) {
        this.next = next;

    }

    @Override
    public void approveLeave(LeaveRequest request) {
        if(request.getDays() <= 5){
            System.out.println("Principal approved leave for " +request.getDays() +"days.");
        }else if(next!=null){
            next.approveLeave(request);
        }

    }
}
