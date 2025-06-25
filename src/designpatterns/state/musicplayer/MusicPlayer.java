package designpatterns.state.musicplayer;

public class MusicPlayer {
    private PlayerState state;
    public static final PlayerState PLAYING_STATE = new PlayState();
    public static final PlayerState PAUSED_STATE = new PauseState();
    public static final PlayerState STOPPED_STATE = new StopState();


    public MusicPlayer() {
        state = STOPPED_STATE;
        state.setPlayer(this);
    }
    public void playerPlay(){
        state.play();
    }
    public void playerPause(){
        state.pause();
    }
    public void playerStop(){
        state.stop();
    }
    public void setState(PlayerState state) {
        this.state = state;
        state.setPlayer(this);
    }
}
