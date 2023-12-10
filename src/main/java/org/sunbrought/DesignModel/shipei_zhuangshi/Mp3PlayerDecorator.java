package org.sunbrought.DesignModel.shipei_zhuangshi;

public class Mp3PlayerDecorator implements MediaPlayer{
    private MediaPlayer mediaPlayer;

    public Mp3PlayerDecorator(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file with additional features. Name: " + fileName);
            // 添加额外的功能
            System.out.println("Adding equalizer to the mp3 file.");
            mediaPlayer.play(audioType, fileName);
        }
        else {
            mediaPlayer.play(audioType, fileName);
        }
    }
}
