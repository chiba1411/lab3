
package lab3;
import java.util.Scanner;
public class Book {
    //thuoc tinh
    public String boCode;
    public String boTitle;
    public String boAuthor;
    //phuong thuc khong tham so
    public Book(){
        
    }
    //phuong thuc co tham so
    public Book(String boCode,String boTitle,String boAuthor){
        this.boCode=boCode;
        this.boTitle=boTitle;
        this.boAuthor=boAuthor;        
    }
    //phuong thuc book
    public Book(Scanner sc){
        String bo=sc.nextLine();        
    }
    //phuong thuc get tra ve gia tri
    public String getboCode(){
        this.boCode=boCode;
        return this.boCode;
    }
    public String getboTitle(){
        this.boTitle=boTitle;
        return this.boTitle;
    }
    public String getboAuthor(){
        this.boAuthor=boAuthor;
        return this.boAuthor;
    }
    //phuong thuc set thay doi gia tri
    public void settboCode(){
        this.boCode=boCode;        
    }
    public void setboCode(){
        this.boTitle=boTitle;
    }
    public void setboAuthor(){
        this.boAuthor=boAuthor;
    }
    //phuong thuc hien thi
    @Override
    public String toString(){
        return"("+"boCode="+ boCode+", boTitle="+boTitle+",boAuthor="+boAuthor+")";
    }
}
