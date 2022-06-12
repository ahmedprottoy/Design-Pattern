public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return (Button) new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return (Checkbox) new WinCheckbox();
    }
}
