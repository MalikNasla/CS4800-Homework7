import java.util.HashMap;
import java.util.List;

public class SongServiceProxy implements SongService {
    private HashMap<Integer, Song> cache;
    private SongService service;

    public SongServiceProxy(){
        this.cache = new HashMap<>();
        this.service = new SongServiceClass();
    }

    @Override
    public Song searchById(Integer songID) {
        if (cache.containsKey(songID)) {
            return cache.get(songID);
        }
        else
        {
            Song song = service.searchById(songID);
            cache.put(songID, song);
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) {

        List<Song> songs = service.searchByTitle(title);
        if (songs != null) {
            for (Song song : songs) {
                cache.put(song.getTitle().hashCode(), song);
            }
        }
        return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> songs = service.searchByAlbum(album);
        if (songs != null) {
            for (Song song : songs) {
                cache.put(song.getTitle().hashCode(), song);
            }
        }
        return songs;
    }
}
