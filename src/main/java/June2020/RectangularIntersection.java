package June2020;

class Rectangle {
	
	public int leftX;
	public int getLeftX() {
		return leftX;
	}

	public void setLeftX(int leftX) {
		this.leftX = leftX;
	}

	public int getBottomY() {
		return bottomY;
	}

	public void setBottomY(int bottomY) {
		this.bottomY = bottomY;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int bottomY;
	public int width;
	public int height;
	
	public Rectangle(int leftX, int bottomY, int width, int height) {
		this.leftX = leftX;
		this.bottomY = bottomY;
		this.width = width;
		this.height = height;
	}
}


 class RangeOverLap {

	 public int startPoint;
	 public int length;
	 
	 public RangeOverLap(int startPoint,int length) {
		 this.startPoint = startPoint;
		 this.length=length;
	 }
	 

	 
	
}


public class RectangularIntersection {

	
	 public static RangeOverLap findXoverLap(int point1,int length1,int point2,int length2) {
		 
		 int highestStartingPoint = Math.max(point1, point2);
		 int minEndPoint = Math.min(point1+length1, point2+length2);
		 
		 if(minEndPoint<=highestStartingPoint) {
			 return new RangeOverLap(0,0);
		 }
		 
		 int overlap = minEndPoint - highestStartingPoint;
		 
		 return new RangeOverLap(highestStartingPoint,overlap);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1, 1, 3, 3);
		Rectangle r2 = new Rectangle(0, 2, 4, 3);
		
		RangeOverLap rx =findXoverLap(r1.getLeftX(), r1.getWidth(),r2.getLeftX(),r2.getWidth());
		RangeOverLap ry =findXoverLap(r1.getBottomY(), r1.getHeight(),r2.getBottomY(),r2.getHeight());
		
	    Rectangle rRes =  new Rectangle(
	    		rx.startPoint,
	    		ry.startPoint,
	            rx.length,
	            ry.length
	        );
	    System.out.println(rRes);
	}

}
