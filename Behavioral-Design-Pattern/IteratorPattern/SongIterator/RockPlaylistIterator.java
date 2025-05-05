// package IteratorPattern.SongIterator;

import java.util.List;

public class RockPlaylistIterator implements SongIterator {
    
    private List<Song> songs;
    private int index = 0;

    public RockPlaylistIterator(List<Song>songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        if(hasNext()) {
            return songs.get(index++);
        }
        return null;
    }
}
