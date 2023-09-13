public class Headphone {
    
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String color = "red";
    
    boolean power = false;
    
    public void powerOn() {
        power = true;
    }
    
    public void powerOff() {
        power = false;
    }
    
    static int volume = 0;
    
    public void volumeUp() {
        volume++;
        System.out.println(volume);
    }
    
    public void volumeDown() {
        volume--;
        System.out.println(volume);
    }
    
    static boolean play = false;
    
    public void play() {
        play = true;
    }
    
    public void pause() {
        play = false;
    }
}
