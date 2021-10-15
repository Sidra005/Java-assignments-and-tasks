package tasktwo;
public class Task2 {
    public static void main(String[] args){
        Book book1= new Book();
        book1.title="JAVA for biginners 3rd edition";
        book1.author="By Prof.David";
        book1.pages=537;
        book1.price=299;
        book1.publication="Easy Coding Publications";
        book1.showinfo();
        
        Book book2= new Book();
        book2.title="OMEGA POINT 12th edition";
        book2.author="By Humayun Ahmed";
        book2.pages=122;
        book2.price=128;
        book2.publication="Shomoy Prokashoni";
        book2.showinfo();
        
        Book book3= new Book();
        book3.title="Digital Fortress 5th edition";
        book3.author="By Dan Brown";
        book3.pages=356;
        book3.price=560;
        book3.publication="St. Martin Press";
        book3.showinfo();
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
       
        book1=book3;
        book1.edition=1;
        book3.showinfo();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        
    }
    }

