
/**
 * Escreva a descrição da classe MusicPlayer aqui.
 * 
 * @author (Kaio Henrique) 
 * @version (06/08/2019)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;

public class MusicPlayer
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private SoundEngine engine;
    private ArrayList<String> musicList;

    /**
     * COnstrutor para objetos da classe MusicPlayer
     */
    public MusicPlayer()
    {
        // inicializa variáveis de instância
        musicList = new ArrayList<String>();
        engine = new SoundEngine();
    }

    public void addFile(String file){
        /*for(String item: musicList){
            if(item.equals(file)){
                System.out.println("This music is already on the List");
                return;
            }
        }*/
        musicList.add(file);
    }
    
    public int getNumberOfFiles(){
        return musicList.size();
    }
    
    public void listFile(){
        Iterator<String> it = musicList.iterator();
        
        while(it.hasNext()){
            String music = it.next();
            System.out.println(musicList.indexOf(music) + ": \"" + music +"\"");
        }
    }
    
    public void removeFile(int file){
        try{    
            musicList.remove(file);
        }
        catch(Exception e){
            System.out.println("This music isn't on list");
        }
    }
    
    public void playFile(String file){
        engine.playCompletely("audio/"+file);
    }
    
    public void playAll(){
        for(String music: musicList){
            engine.playCompletely("audio/"+music);
        }
    }
    
    public void removeFile(String file){
       try{
           Iterator<String> it = musicList.iterator();
           while(it.hasNext()){
               String music = it.next();
               if(music.contains(file)){
                   musicList.remove(music);
                   return;
               }
           }   
       }
       catch(Exception e){
           System.out.println("This music isn't on list");
       } 
    }
}
