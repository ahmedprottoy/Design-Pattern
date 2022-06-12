public class Test {
    public static void main(String[] args) {
        GUIFactory gui = GenFactory.getFactory(false);
        Button btnm= gui.createButton();
        Checkbox chkm = gui.createCheckbox();

        btnm.btn();
        chkm.chkbx();


        gui = GenFactory.getFactory(true);
        Button btnw = gui.createButton();
        Checkbox chkw = gui.createCheckbox();
        btnw.btn();
        chkw.chkbx();


    }
}
