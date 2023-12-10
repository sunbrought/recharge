package org.sunbrought.DesignModel.shipei_zhuangshi;

/**
 * 适配器模式用于将一个接口转换成另一个接口，而装饰器模式则用于动态地给对象添加一些额外的职责。
 * 当我们需要将一个已有的接口转换成新的接口，并且还需要给对象添加一些额外的职责时，可以使用这两个模式混合使用。
 */
public class StartMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new Mp3Player();
        mediaPlayer.play("mp3", "song.mp3");

        //适配
        AdvancedMediaPlayer advancedMediaPlayer = new VlcPlayer();
        MediaPlayer mediaPlayerAdapter = new MediaPlayerAdapter(advancedMediaPlayer);
        mediaPlayerAdapter.play("vlc", "movie.vlc");

        //装饰
        MediaPlayer decoratedMediaPlayer = new Mp3PlayerDecorator(mediaPlayer);
        decoratedMediaPlayer.play("mp3", "song.mp3");
    }
}
