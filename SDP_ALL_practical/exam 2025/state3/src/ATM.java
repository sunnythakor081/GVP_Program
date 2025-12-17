class ATM implements bank{

    @Override
    public void setbank(context context) {
        System.out.println("ATM......!");
        context.setbihaviar(new PIN());
    }
     
}
