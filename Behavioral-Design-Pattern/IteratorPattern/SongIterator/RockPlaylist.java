// package IteratorPattern.SongIterator;

import java.util.ArrayList;
import java.util.List;

public class RockPlaylist implements Playlist {
    
    private List<Song> songs = new ArrayList<>();

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public SongIterator createIterator() {
        return new RockPlaylistIterator(songs);
    }
}
