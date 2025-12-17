package OsComponent;

import java.util.Scanner;

public class Client_OS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;
        System.out.println("Enter os name");
        String osname = sc.next();

        System.out.println("Enter Button");
        String choice = sc.next();


        Abstractfactory absobj = Abstractfactory.getosname(osname);
//

        if (choice.toLowerCase() == "button") {
            Button bt = absobj.getbutton();
            result = bt.creactebutton();

        } else if (choice.toLowerCase()=="radio") {

            RadioButton rt = absobj.getradio();
            result = rt.createradioButton();

        } else if (choice.toLowerCase()=="check") {
            CheckButton cb = absobj.getcheck();
            result = cb.createcheckButton();

        }else {
            result = "invalid choice";
        }


        System.out.println(result);


    }
}
