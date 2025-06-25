package designpatterns.state.musicplayer;

public class StopState extends PlayerState{

    @Override
    public void play() {
        //从停止状态开始播放音乐，状态改变为播放状态
        player.setState(player.PLAYING_STATE);
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("播放器处于停止状态，无法暂停");
    }

    @Override
    public void stop() {
        System.out.println("播放器已经处于停止状态");
    }

}
