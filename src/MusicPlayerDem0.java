// Feyza Yalçındağ 250444002 19.10.26
public class MusicPlayerDem0{

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();

        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        playlist.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlaylist();
    }
}

