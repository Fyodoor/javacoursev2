package lesson_10.media;

public class AudioDisk extends Disk {
    // - муз. альбомов

    private String singer;
    private int countOfTrack;


    public AudioDisk() {
    }



    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountOfTrack() {
        return countOfTrack;
    }

    public void setCountOfTrack(int countOfTrack) {
        this.countOfTrack = countOfTrack;
    }
}
