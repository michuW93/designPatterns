package State;

public class SecondState implements State {
    @Override
    public void doAction(Context context) {
        if (0 == 0) //can be condition here
        {
            System.out.println("Second state");
            context.setState(this);
        } else {
            System.out.println("Incorrect state to do action from SecondState");
        }
    }
}
