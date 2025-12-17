class context {

    bank state;
    public  context()
    {
       state=new ATM();
    }
    public void setbihaviar(bank state)
    {
         this.state=state;
    }
    public void setbank()
    {
        state.setbank(this);
    }
}
