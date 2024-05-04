import imgui.ImGui;
import imgui.app.Application;
import imgui.app.Configuration;
public class Main extends Application
{
    @Override
    protected void configure(Configuration config) {
        config.setTitle("Dominions 5 Trainer by RiritoNinigaya");
    }

    @Override
    public void process() {
        ImGui.begin("Dominions5 Trainer by RiritoNinigaya");
        ImGui.text("Hello, World!");
        ImGui.setWindowSize(155, 300);
        ImGui.end();
        ImGui.render();
    }
    public static void main(String[] args) {
        System.out.printf("Welcome To Dominions5 Trainer by RiritoNinigaya");
        launch(new Main());
    }
}
