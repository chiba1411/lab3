
package lab3;

public class Triangle {
    //thuoc tinh
    private float width=0.0f;
    private float height=0.0f;
    //phuong thuc khoi tao khong tham so
    public Triangle(){
        this.width=0;
        this.height=0;
    }
    //phuong thuc khoi tao co tham so
    public Triangle(float width,float height){
        this.width=width;
        this.height=height;
    }
    //phuong thuc get
    public float getwidth(float width){
        this.width=width;
        return this.width;
    }
    public float getheight(float height){
        this.height=height;
        return this.height;
    }
    //phuong thuc set
    public void setwigth(float width){
        this.width=width;
    }
    public void setheight(float height){
        this.height=height;
    }
    //phuong thuc hien thi
    @Override 
    public String toString(){
        return "("+this.width +";"+ this.height +")";
    }
}
