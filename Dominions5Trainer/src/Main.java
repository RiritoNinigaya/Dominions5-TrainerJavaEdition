//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;

public class Main extends Application {
    public Main() {
    }

    protected void configure(Configuration config) {
        config.setTitle("Dominions 5 Trainer by RiritoNinigaya");
    }

    public void process() {
        ImGui.begin("Dominions5 Trainer by RiritoNinigaya");
        ImGui.text("Hi, this is My First Trainer for Dominions 5... \nSo Enjoy to use this!!!");
        ImGui.setWindowSize(455.0F, 455.0F);
        if (ImGui.button("Unlimited Perls in Player 1")) {
            System.out.printf("\nComing Soon!!!");
        }

        ImGui.end();
        ImGui.render();
    }

    public static void main(String[] args) {
        System.out.printf("Welcome To Dominions5 Trainer by RiritoNinigaya");
        launch(new Main());
    }
}
