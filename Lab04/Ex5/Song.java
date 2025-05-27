package Lab04.Ex5;

public class Song {
    public String title;
    public String singer;
    public int length; 
    public double price;

    public Song(String title, String singer, int length, double price) {
        this.title = title;
        this.singer = singer;
        this.length = length;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(" | %-15s | %-15s | %-5s | %-8.2f$ |", title, singer, length + "mins", price);
    }
}
