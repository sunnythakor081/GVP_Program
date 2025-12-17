package ChainOfResponsibility.mydemo;

public class LeaveRequest {
    private int days;

    LeaveRequest(int days){
        this.days = days;
    }

    public int getDays(){
        return days;
    }


}
