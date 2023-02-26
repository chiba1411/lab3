
package lab3;

public class Point2D {
    //thuoc tinh
    private float x=0.0f;
    private float y=0.0f;
    //ham khoi tao khong tham so
    public Point2D(){
        this.x=0;
        this.y=0;
    }
    //ham khoi tao co tham so
    public Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    //ham set,get
    public void getx(float x){
        this.x=x;
    }
    public void sety(float y){
        this.y=y;
    }
}
