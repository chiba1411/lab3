
package lab3;
import java.util.Scanner;
public class LibraryCard {
    //thuoc tinh
    public long lbCode;
    public String owner;
    public int borrowCount;
    //phuong thuc khong tham so
    public LibraryCard(){
        
    }
    //phuong thuc co tham so
    public LibraryCard(long lbCode,String owner,int borrowCount){
        this.lbCode=lbCode;
        this.owner=owner;
        this.borrowCount=borrowCount;
    }
    //phuong thuc get tra ve gia tri
    public long getLbCode(){
        this.lbCode=lbCode;
        return this.lbCode;
    }
    public String Owner(){
        this.owner=owner;
        return this.owner;
    }
    public int getBorrowCount(){
        this.borrowCount=borrowCount;
        return this.borrowCount;
    }
    // phuong thuc set thay doi gia tri
    public void setLbCode(){
        this.lbCode=lbCode;
    }
    public void setOwner(){
        this.owner=owner;
    }
    public void checkOut(Scanner sc){
        int num=sc.nextInt();
    }
    @Override
    public String toString(){
        return "("+"ibCode="+lbCode+",owner"+owner+")";
    }
}
