import greenfoot.*;

public class State  
{
    // instance variables - replace the example below with your own
    public static int win_flag = 0;
    public static GreenfootSound sound = new GreenfootSound("nyan_cat.mp3");
    
    public static void setLose(){
        win_flag = -1;
        sound.stop();
    }
    
    public static void setWin(){
        win_flag = 1;
        sound.stop();
    }
    
    public static void startMusic(){
        sound.setVolume(45);
        sound.playLoop();
    }
    
    public static int lose(){
        if(win_flag == -1) {
            sound.playLoop();
            return -1;
        }
        return 0;
    }
}
