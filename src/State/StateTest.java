package State;

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        SecondState secondState = new SecondState();
        secondState.doAction(context);
    }
}