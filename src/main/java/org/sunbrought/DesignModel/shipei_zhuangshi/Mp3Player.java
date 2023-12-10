package org.sunbrought.DesignModel.shipei_zhuangshi;

public class Mp3Player implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
    }
}
