public interface Sing {


     void singAlbum(String album);
     void singAll();

     default String greet(){
         return "Good evening everyone! Let`s gooo!!";
     }
}
