
package lab3;
import java.util.Scanner;
public class Student{ 
    //thuoc tinh
    public String stID;
    public String stName;
    public String stClass;
    //phuong thuc khong co tham so
    public Student(){
        
    }
    //phuong thuc co tham so
    public Student(String stID,String stName,String stClass){
        this.stID=stID;
        this.stName=stName;
        this.stClass=stClass;
        
    }
    //phuong thuc Studen
    public Student(Scanner sc){
        int st;
        System.out.println("nhap st");
        st=sc.nextInt();
    }
    //phuong thuc get tra ve gia tri cho thuoc tinh
    public String getstID(String stID){
        this.stID=stID;
        return this.stID;
    }
    public String getstName(String stName){
        this.stName=stName;
        return this.stName;
    }
    public String getstClass(String stClass){
        this.stClass=stClass;
        return this.stClass;
    }
    // phuong thuc set thay doi gia thi thuoc tinh
    public void setstID(){
        this.stID=stID;
    }
    public void setstName(){
        this.stName=stName;
    }
    public void setstClass(){
        this.stClass=stClass;
    }
    //phuong thuc hien thi
    @Override
    public String toString(){
        return "("+"stID="+stID+",stName="+stName+",stClass="+stClass+")";
    }
}
