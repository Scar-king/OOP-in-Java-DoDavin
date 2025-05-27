package Lab04.Ex5;

public class Album {
    public String title;
    public String genre;
    public Song[] songs;
    public int songCount;

    public Album(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.songs = new Song[100];
        this.songCount = 0;
    }

    public void addSong(Song song) {
        if (songCount < songs.length) {
            songs[songCount++] = song;
        } else {
            System.out.println("Cannot add more songs.");
        }
    }

    public void displaySongs() {
        if (songCount == 0) {
            System.out.println("None of song");
        } else {
            for (int i = 0; i < songCount; i++) {
                System.out.println("| " + (i + 1) + songs[i]);
            }
        }
    }
}

