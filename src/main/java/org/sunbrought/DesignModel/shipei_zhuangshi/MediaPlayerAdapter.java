package org.sunbrought.DesignModel.shipei_zhuangshi;

public class MediaPlayerAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMusicPlayer){
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.play(audioType, fileName);
        }
        else if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
    }
}
