// package IteratorPattern.SongIterator;

public class SongIteratorDemo {
    public static void main(String[] args) {
        Playlist myRockPlaylist = new RockPlaylist();
        myRockPlaylist.addSong(new Song("Bohemian", "Queen"));
        myRockPlaylist.addSong(new Song("Shironamhin", "Shironamhin"));

        SongIterator iterator = myRockPlaylist.createIterator();

        System.out.println("Rock Playlist: ");
        while(iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println(" - " + song.getDetails());
        }
    }
}
