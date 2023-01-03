package com.arrays.object;

public class Areas {
	
		int height;
		int width;
		int length;
		int radious;
	    int breath;
	   
	    
	    public double circleArea()
	    {
	    	double r=(3.14)*(radious*radious);
	    	return r;
	    }
		
	    public int rectanglar(int length,int breath) 
	    {
	    int a=length*breath;
	    return a;
	    }
	    public double cylinder(int radious,int height)
	    {
	    double v=(3.14)*(radious*radious)*height;
	    	return v;
	    }
	
}

