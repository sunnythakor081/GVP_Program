 class green implements tarafik {

    @Override
    public void tarafiklait(context object) {
        System.out.println("Green On");
        object.soltrafik(new red());
    }
    
}
