// Feyza Yalçindağ 250444002 19.10.26
public class MusicPlaylist {
    private SongNode head ;
    private SongNode tail ;
    private SongNode current ;
    public MusicPlaylist(){
        this.current = null ;
        this.head = null ;
        this.tail = null ;
    }
    //Add fonksiyon
    public void addSong(String title){
        SongNode newNode = new SongNode(title);
        // we need to write our if becaue of the empty occasions
        if ( head == null ){
            head = newNode ;
            tail = newNode ;
            current = newNode ;
        }else{// i get confused in here
            tail.next = newNode ;
            newNode.prev = tail ;
            tail = newNode ;
        }
    }
    // we need remove function here
    public void removeSong(String title){
        SongNode temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if ( temp == null ){
            System.out.println("The song isnt in the playlist " );
            return ;
        }
        System.out.println("Removed :" + temp.title );
        if ( temp == head){
            head = head.next ;
            if ( head != null ){
                head.prev = null ;
            }
            if ( temp == tail ){
                tail = tail.prev ;
                if ( tail != null){
                    tail.next = null ;
                }else{
                    if ( temp.next != null ){
                        temp.next.prev = temp.prev ;
                    }
                }
                if (temp == current) {
                    current = temp.next != null ? temp.next : temp.prev;
                }
            }
        }

    }
    public void nextSong(){
        if( current != null && current.next != null){
            current = current.next ;
        }else {
            System.out.println("Already at the last song of the playlist ");
        }

    }
    public void previousSong(){
        if(current != null && current.prev != null ){
            current= current.prev ;
        }else{
            System.out.println("Already at the first song of the playlist.");
        }
    }
    public void displayCurrentSong(){
        if ( current != null ){
            System.out.println("Current Song :" + current.title);
        }else{
            System.out.println("There is no currently song ");
        }
    }
    public void displayPlaylist(){
        System.out.println("The playlist:");
        SongNode temp = head ;
        while (temp!= null ){
            System.out.println(temp.title);
            temp= temp.next ;
        }

    }
}
