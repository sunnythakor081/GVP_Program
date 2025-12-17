class context {

    tarafik state;
    public context()
    {
         state=new green();
    }
    public void soltrafik(tarafik state)
    {
            this.state=state;  
    }
    public void stat()
    {
        state.tarafiklait(this);
    }
}
