package designpatterns.state.musicplayer;

public class PlayState extends PlayerState{

    @Override
    public void play() {
        System.out.println("Music is already playing");
    }

    @Override
    public void pause() {
        player.setState(MusicPlayer.PAUSED_STATE);
        System.out.println("Paused...");
    }

    @Override
    public void stop() {
        player.setState(MusicPlayer.STOPPED_STATE);
        System.out.println("Stopped...");
    }
}
