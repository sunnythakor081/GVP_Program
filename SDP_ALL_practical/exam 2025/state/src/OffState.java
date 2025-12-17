 class OffState implements State {
    public void pressButton(Fan fan) {
        System.out.println("Turning fan ON.");
        fan.setState(new OnState());
    }
}
