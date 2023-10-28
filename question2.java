import java.util.HashMap;

class book <T,U>{
    private T bookTitle;
    private U bookISBN;

    public book(T bookTitle, U bookISBN) {
        this.bookTitle = bookTitle;
        this.bookISBN = bookISBN;
    }

    public U getISBN() {
        return bookISBN;
    }
}

class library {
    public static void main(String[] args) {
        HashMap<Integer,book<?,?>> bookList = new HashMap<>();

        //create a book object with string ISBN and String Title
        book<String,String> book1 = new book<>("ISBN12345", "Harry Potter");
        bookList.put(1,book1);

        //creating another object for books with integer isbn and string title
        book<Integer,String> book2 = new book<>(123456,"Ring of Power");
        bookList.put(2,book2);

        for (int id:bookList.keySet()){
        book value = bookList.get(id);
            System.out.println("Book ID is: "+id+"and the ISBN is: "+value.getISBN());
        }


    }
}