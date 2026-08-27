class Book{
   private int bookid;
  private String bookname;
   private String author;
   private int price;
   public int getBookid(){
    return bookid;

   }
   public void setBookid(int a){
    bookid=a;

   }
   public String getAuthor(){
    return author;

   }
   public void setAuthor(String m){
    author=m;
   }
   public String getBookname(){
    return bookname;

   }
   public void setBookname(String n){
    bookname=n;

   }
   public int getPrice(){
    return price;
   }
public void setPrice(int b){
    price=b;
}
}
class Person{
    int personid;
    void details(){
        System.out.println("heis out side person");

    }
}

class Student extends Person{
    int studentid;
    @Override
    void details(){
        System.out.println("he is a student");
    }

}
class Faculty extends Person{
    int facultyid;
    @Override
    void details(){
        System.out.println("he is faculty");
    }
}

    

    






public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book tv=new Book();
        tv.setBookid(323);
        tv.setAuthor("APJ Abdul kalam");
    tv.setBookname("wings of fire");
    tv.setPrice(300);
    System.out.println("book id is: " + tv.getBookid());
    System.out.println("author is:" + tv.getAuthor());
    System.out.println("bokk name is:" + tv.getBookname());
    System.out.println("book price is :" + tv.getPrice());
    Student obj =new Student();
    obj.details();
    System.out.println();




        
    }
    
}
