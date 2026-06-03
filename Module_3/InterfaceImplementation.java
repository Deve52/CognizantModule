package Cognizant.Module_3;

interface playable{
    void play();
}
class musicPlayer implements playable{
    public void play(){
        System.out.println("playing");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        musicPlayer obj = new musicPlayer();
        obj.play();
    }
}
