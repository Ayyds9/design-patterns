package designpatterns.state.musicplayer;

public class PauseState extends PlayerState{

    @Override
    public void play() {
        //从暂停状态开始播放音乐，状态改变为播放状态
        player.setState(MusicPlayer.PLAYING_STATE);
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("播放器已经处于暂停状态");
    }

    @Override
    public void stop() {
        //从暂停状态开始停止音乐，状态改变为停止状态
        player.setState(MusicPlayer.STOPPED_STATE);
        System.out.println("Stopped");
    }
}
