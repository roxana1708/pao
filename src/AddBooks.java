import Classes.BookTitle;
import java.util.List;

public class AddBooks {
    public static void main(List<BookTitle> books) {
        books.add(new BookTitle("Trilogia NewYork-ului", "Paul Auster", "fiction", 10));
        books.add(new BookTitle("Eseuri", "Montaigne", "essay", 10));
        books.add(new BookTitle("Ganduri catre sine insusi", "Marcus Aurelius", "philosophy", 10));
        books.add(new BookTitle("Fratii Karamazov", "F.M. Dostoievski", "fiction", 10));
        books.add(new BookTitle("The Black Swan", "Nassim Nicholas Taleb", "non-fiction", 10));
        books.add(new BookTitle("Muncile lui Hercule", "Agatha Christie", "crime", 10));
        books.add(new BookTitle("Solenoid", "Mircea Cartarescu", "fiction", 10));
        books.add(new BookTitle("Gluma", "Milan Kundera", "fiction", 10));
        books.add(new BookTitle("Despre Destin", "A. Plesu & G. Liiceanu", "philosophy", 10));
        books.add(new BookTitle("Dulcele Bar", "JR Moehringer", "fiction", 10));
        books.add(new BookTitle("The Castel", "Franz Kafka", "fiction", 10));
        books.add(new BookTitle("Greva Pacatosilor", "Florin Chirculescu", "fiction", 10));
        books.add(new BookTitle("Le Malade imaginaire", "Moliere", "theater", 10));
        books.add(new BookTitle("Irlandezul", "Charles Brandt", "crime", 10));
        books.add(new BookTitle("1913: Vara secolului", "Florin Ilies", "fiction", 10));
        books.add(new BookTitle("In cafeneaua tineretii pierdute", "Patrick Modiano", "fiction", 10));
    }
}
