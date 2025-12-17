package ChainOfResponsibility.mydemo;

public class SchoolLeaveSystem {
    public static void main(String[] args) {
        LeaveApprover classTeacher = new ClassTeacher();
        LeaveApprover principal = new Principal();
        LeaveApprover derector = new Director();

        classTeacher.setNextApprover(principal);
        principal.setNextApprover(derector);

        LeaveRequest leavel1 = new LeaveRequest(1);
        LeaveRequest leave2 = new LeaveRequest(5);
        LeaveRequest leave3 = new LeaveRequest(11);

        System.out.println("request 1");
        classTeacher.approveLeave(leavel1);

        System.out.println("request 2");
        principal.approveLeave(leave2);

        System.out.println("request 3");
        derector.approveLeave(leave3);

    }
}
