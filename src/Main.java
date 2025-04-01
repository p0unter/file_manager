import System.UI;
import System.Process;

public class Main {
    public static void main(String[] args) {
        UI.printMain();

        while(true) {
            UI.columnPointer();
            Process.setCommand();
        }
    }
}