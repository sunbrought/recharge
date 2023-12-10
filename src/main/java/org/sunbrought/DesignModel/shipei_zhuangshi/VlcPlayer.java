package org.sunbrought.DesignModel.shipei_zhuangshi;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            System.out.println("Playing vlc file. Name: " + fileName);
        }
    }
}
