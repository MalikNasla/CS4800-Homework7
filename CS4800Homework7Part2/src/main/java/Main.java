import java.util.List;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongServiceProxy();

        System.out.println("Searching By ID");
        Song searchId = songService.searchById(1);
        System.out.println("Title: " + searchId.getTitle());
        System.out.println("Album: " + searchId.getAlbum());
        System.out.println("Artist: " + searchId.getArtist());
        System.out.println("Duration: " + searchId.getDuration());
        System.out.println();


        System.out.println("Searching By Title");
        List<Song> searchTitle = songService.searchByTitle("Tamally Maak");
        for (Song song : searchTitle){
            System.out.println("Title: " + song.getTitle());
            System.out.println("Album: " + song.getAlbum());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Duration: " + song.getDuration());
        }
        System.out.println();


        System.out.println("Searching By Album");
        List<Song> searchAlbum = songService.searchByAlbum("Nsay");
        for (Song song : searchAlbum){
            System.out.println("Title: " + song.getTitle());
            System.out.println("Album: " + song.getAlbum());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Duration: " + song.getDuration());
        }
    }
}
