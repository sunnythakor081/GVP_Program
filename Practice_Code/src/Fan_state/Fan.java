package Fan_state;

public class Fan {
    private State state;

   Fan(){
       state = new Onstate();
   }

   public  void setState(State state)

   {
     this.state = state;
   }

   public void pressButtern(){

       state.pressButtern(this);
   }
}
