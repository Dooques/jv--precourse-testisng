package test.TestObjects;

public class Song {
    private final String name;
    private final int length;
    private final boolean isInPlaylist;

    public Song(String name, int length, boolean isInPlaylist) {
        this.name = name;
        this.length = length;
        this.isInPlaylist = isInPlaylist;
    }

    public boolean getIsInPlaylist() {
        return this.isInPlaylist;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Song[name=" + name + ", length=" + length + "]";
    }
}