import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServiceClass implements SongService{

    private Map<Integer, Song> songCache;

    public SongServiceClass() {
        this.songCache = new HashMap<>();
        songCache.put(1, new Song("Tamally Maak", "Amr Diab", "Tamally Maak", 268));
        songCache.put(2, new Song("Kalam Eneih", "Sherine", "Nsay", 235));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        return songCache.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        List<Song> songs = new ArrayList<>();
        for (Song song : songCache.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songs.add(song);
            }
        }
        return songs.isEmpty() ? null : songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        List<Song> songs = new ArrayList<>();
        for (Song song : songCache.values()) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                songs.add(song);
            }
        }
        return songs.isEmpty() ? null : songs;
    }
}
