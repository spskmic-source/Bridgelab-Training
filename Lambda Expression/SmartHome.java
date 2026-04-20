interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {

        
        LightAction motion = () -> System.out.println("Lights ON due to motion");

       
        LightAction night = () -> System.out.println("Dim lights for night");


        LightAction voice = () -> System.out.println("Lights ON via voice command");

        motion.activate();
        night.activate();
        voice.activate();
    }
}