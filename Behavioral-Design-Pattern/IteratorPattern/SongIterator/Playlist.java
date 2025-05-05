// package IteratorPattern.SongIterator;

public interface Playlist {
    void addSong(Song song);
    SongIterator createIterator();
}
