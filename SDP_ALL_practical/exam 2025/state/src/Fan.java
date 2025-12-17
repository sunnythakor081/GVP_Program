 class Fan {
    private State state;

    public Fan() {
        state = new OffState();  // Initial state is Off
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton() {
        state.pressButton(this);
    }
}
