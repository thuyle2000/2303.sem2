/*
Mo ta 1 doi tuong hinh hoc 2D, bao gom cac :
= thuoc tinh : PI =3.1415
- phuong thuc: tinh dien-tich, chu-vi, toString, input
 */
package model;

public abstract class Shape {
    public static float PI=3.1415F;
    
    //ham tinh va tra ve dien tich
    public abstract float area();
    
    //ham tinh va tra ve chu vi
    public abstract float perimeter();
    
    //ham input()
    public abstract void input();

    @Override
    public String toString() {
        return String.format("DT=%10.2f, CV=%10.2f", area(), perimeter());
    }
}
