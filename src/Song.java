public class Song {
    String song;
    Double duration;
    public Song(String song,Double duration){
        this.song=song;
        this.duration=duration;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getSong() {
        return song;
    }

    public Double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
