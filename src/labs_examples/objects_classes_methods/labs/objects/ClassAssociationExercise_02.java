package labs_examples.objects_classes_methods.labs.objects;

//Created by Farida-Belhous-04/17/2020
/*
Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
class will contain the main() method. In the main() create an object of each POJO you just created and associate
the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)

 */
public class ClassAssociationExercise_02 {
    public static void main(String[] args) {
        Book b = new Book("Harry Potter");
        Author a = new Author("J.K Rowling");
        AuthorBookAssociation ab = new AuthorBookAssociation(b, a);
        System.out.println(ab.toString());

    }
}

class Book {
    String tittle;
    public Book(String tittle){
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                '}';
    }
}
class Author {
    String name;
    public Author(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
class AuthorBookAssociation {
       Book b;
       Author a;


    public AuthorBookAssociation(Book b, Author a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public String toString() {
        return "AuthorBookAssociation{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }
}
