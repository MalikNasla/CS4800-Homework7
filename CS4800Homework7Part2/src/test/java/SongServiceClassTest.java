import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SongServiceClassTest {
    SongServiceClass serviceClass = new SongServiceClass();

    @Test
    public void testSearchById(){
        Song song = serviceClass.searchById(1);
        assertNotNull(song);
        assertEquals("Tamally Maak", song.getTitle());
    }

    @Test
    public void testSearchByTitle(){
        List<Song> song = serviceClass.searchByTitle("Kalam Eneih");
        assertNotNull(song);
        assertEquals(1, song.size());
        assertEquals("Kalam Eneih", song.get(0).getTitle());
    }

    @Test
    public void testSearchByAlbum() {
        List<Song> songs = serviceClass.searchByAlbum("Nsay");
        assertNotNull(songs);
        assertEquals(1, songs.size());
        assertEquals("Nsay", songs.get(0).getAlbum());
    }
}
