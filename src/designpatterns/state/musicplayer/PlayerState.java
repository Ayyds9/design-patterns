package designpatterns.state.musicplayer;

public abstract class PlayerState {
    protected MusicPlayer player;

    public void setPlayer(MusicPlayer player) {
        this.player = player;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

}
