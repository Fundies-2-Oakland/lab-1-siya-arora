package org.example;
//What to do for the Jan 9/10 lab:
//
//Write a class Vector3D that represents a 3D vector. This class should contain the following:
//
//A constructor that takes in x, y, z components of the vector. Each parameter is of type double.
//Methods to get the values of individual components (e.g. getX, getY, getZ).
//
//A toString method that returns a string that describes this vector. This string should be of the form “(x, y, z)” replacing the letters with their values. Each component should be formatted to round to exactly two decimal places (look at the String.format method to see how to do this).
//A method getMagnitude that returns its magnitude.
//A method normalize that returns a normalized version of this vector. It should throw an IllegalStateException object if this operation cannot be completed (magnitude is zero).
//A method add that returns the result of adding this vector to another vector. It should not change the vectors that are being added.
//A method multiply that returns the result of multiplying this vector by a constant. It should not change the vector that is being multiplied.
//A method dotProduct that returns the dot product of this vector and another vector. It should not change the two vectors.
//A method angleBetween that returns the angle between two vectors in degrees. It should not change the two vectors. It should throw an IllegalStateException if this operation cannot be completed.
//A method crossProduct that returns the cross product of this vector and another vector. It should not change the two vectors.

public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public double getMagnitude(){
        double x = getX();
        double y = getY();
        double z = getZ();
        double sum = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        return Math.sqrt(sum);
    }
    public Vector3D normalize(){
        double mag = getMagnitude();
        if (mag == 0){
            throw new IllegalArgumentException("Magnitude is 0. ");
        } else{
            return new Vector3D(getX()/mag, getY()/mag, getZ()/mag);
        }
    }
    public Vector3D add(Vector3D otherVector){
        return new Vector3D(getX()+otherVector.getX(), getY()+otherVector.getY(), getZ()+otherVector.getZ());
    }
    public Vector3D multiply(int constant){
        return new Vector3D(getX()*constant, getY()*constant, getZ()*constant);
    }
}
