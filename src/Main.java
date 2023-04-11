public class Main {
    public static void main(String[] args) {

        Author bulgakov = new Author("Mihail", "Bulgakov");

        Book book1 = new Book("Мастер и маргарита",bulgakov,1928);

        book1.setWritingDateBook(1940);

        System.out.println(" дата окончания написания романа - " + book1.getWritingDateBook());


        Author pushkin = new Author("Alexandr","Pushkin");
        Book book2 = new Book("Евгений Онегин", pushkin, 1831);
        System.out.println(book2.getAuthor());
        System.out.println(book2.getNameBook() + ", " +pushkin +","+ book2.getWritingDateBook());


        Author author = new Author("Сергей ","Есенин");
        System.out.println(author.getNameAuthor() + author.getSecondNameAuthor());

        Author author2 = new Author("Николай ","Гоголь");
        System.out.println(author2.getNameAuthor() + author2.getSecondNameAuthor());
    }


}/*Напишите небольшой библиотечный справочник, где хранится информация о книгах.
Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и
в нем протестировать работу вашего кода.
Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
Напишите конструкторы для обоих классов, заполняющие все поля.
Создайте геттеры для всех полей автора и всех полей книги.
Создайте сеттер для поля «Год публикации» у книги.
В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и
 инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
Метод main не должен находиться в классах Book и Author.
Создайте отдельный класс для запуска приложения и объявите метод main в нем.
В том же методе main измените год публикации одной из книг с помощью сеттера.
Так как вы изучили геттеры и сеттеры, оставлять поля открытыми, без модификатора доступа private, недопустимо.*/

