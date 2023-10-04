/*  interface mo ta cac ham tinh thue  */
package model;

public interface ITaxable {
    public static final float VAT = 7.5F;
    float IT = 10;
    
    public float getTax();
}
