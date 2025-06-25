package designpatterns.state.musicplayer;

public class Client {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();

        //先播放，再暂停，再停止
        musicPlayer.playerPlay();
        musicPlayer.playerPause();
        musicPlayer.playerStop();

        //先暂停，再播放，再停止
        musicPlayer.playerPause();
        musicPlayer.playerPlay();
        musicPlayer.playerPause();
    }
}
