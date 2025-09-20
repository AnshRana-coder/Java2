class BoxClass{
    
    int height;
    int width;

    BoxClass(){
    	this.height = 20;
    	this.width = 49;
    }
    BoxClass(int height , int width){
    	this.height = height;
    	this.width = width;

    }
}
class BoxClassMain{
	
	public static void main(String[] args){
		BoxClass b1 = new BoxClass();
		BoxClass b2 = new BoxClass(4,6);
	}
}