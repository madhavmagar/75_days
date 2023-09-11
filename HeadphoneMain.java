public class HeadphoneMain {

    public static void main (String[] args) {
        
        Headphone h = new Headphone();
        
        System.out.println(h.color);
        
        h.powerOn();
        h.powerOff();
        h.volumeUp();
        h.volumeUp();
        h.volumeUp();
        h.volumeUp();
        h.volumeUp();
        h.volumeUp();
        System.out.println(h.power);
        // System.out.println(volume);
    }
}
