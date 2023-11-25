package engineTester;

import renderEngine.DisplayManager;
import utils.Consts;

public class Launcher {
    private static DisplayManager window;


    public static void main(String[] args) {
        window = new DisplayManager(Consts.TITLE, Consts.WIDTH, Consts.HEIGHT, false);

        window.init();
        while (!window.windowShouldClose()){
            window.update();
        }
        window.cleanUp();

    }

    public static DisplayManager getWindow() {
        return window;
    }


}
