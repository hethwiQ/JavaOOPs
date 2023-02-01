interface Command {
    void run();
}
class Light {
    public void on() {
        System.out.println("Light is on");
    }
    public void off() {
        System.out.println("Light is off");
    }
}
class BulbOn implements Command {
    Light light;
    public BulbOn(Light light) {
        this.light = light;
    }
    public void run() {
        light.on();
    }
}
class BulbOff implements Command {
    Light light;
    public BulbOff(Light light) {
        this.light = light;
    }
    public void run() {
        light.off();
    }
}
class Radio {
    public void on() {
        System.out.println("Stereo is on");
    }
    public void off() {
        System.out.println("Stereo is off");
    }
    public void CD() {
        System.out.println("Stereo is set " + "for CD input");
    }
    public void DVD() {
        System.out.println("Stereo is set"+ " for DVD input");
    }
    public Radio() {
        System.out.println("Stereo is set" + " for Radio");
    }
    public void Volume(int volume) {
        System.out.println("Stereo volume set" + " to " + volume);
    }
}
class RadioOff implements Command {
    Radio radio;
    public RadioOff(Radio radio) {
        this.radio = radio;
    }
    public void run() {
        radio.off();
    }
}
class RadioWithCD implements Command {
    Radio radio;
    public RadioWithCD(Radio radio) {
        this.radio = radio;
    }
    public void run() {
        radio.on();
        radio.CD();
        radio.Volume(11);
    }
}
class Remote {
    Command slot;

    public Remote() {
    }
    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonPressed() {
        slot.run();
    }
}
class RemoteTest {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Light light = new Light();
        Radio radio = new Radio();
        //-------------------------------
        remote.setCommand(new BulbOn(light));
        remote.buttonPressed();
        remote.setCommand(new RadioWithCD(radio));
        remote.buttonPressed();
        remote.setCommand(new RadioOff(radio));
        remote.buttonPressed();
    }
}
