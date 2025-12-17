 class yellow implements tarafik{

    @Override
    public void tarafiklait(context object) {
    System.out.println("Yellow ON"); 
    object.soltrafik(new green());
    }
    
}
