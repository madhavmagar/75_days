public class Headphone {
    
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String color = "red";
    
    static boolean power = false;
    
    public static void powerOn() {
        power = true;
    }
    
    public static void powerOff() {
        power = false;
    }
    
    static int volume = 0;
    
    public static void volumeUp() {
        volume++;
        System.out.println(volume);
    }
    
    public static void volumeDown() {
        volume--;
        System.out.println(volume);
    }
    
    static boolean play = false;
    
    public static void play() {
        play = true;
    }
    
    public static void pause() {
        play = false;
    }
}
