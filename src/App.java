import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String musicPath = "AlphaEdge.wav";
        play(musicPath);
        JOptionPane.showMessageDialog(null, musicPath + " Is Playing \n    Press 'OK' to stop");
    }

    public static void play(String path){
        try
        {
            File music = new File(path);
            if(music.exists()){
                AudioInputStream audio = AudioSystem.getAudioInputStream(music);
                Clip clip = AudioSystem.getClip();
                clip.open(audio);
                clip.start();
            }else{
                System.out.println("File Not Found");
            }
        }
        catch(Exception s)  
        {
            System.out.println(s);
        }
    }
}
