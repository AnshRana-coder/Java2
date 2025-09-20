class Box {
    float width, height, depth;

    Box() {
        width = height = depth = 0;
    }

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    void displayVolume() {
        System.out.println("Volume of Box = " + (width * height * depth));
    }
}

class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super(); 
        weight = 0;
    }

    BoxWeight(float w, float h, float d, float wt) {
        super(w, h, d); 
        weight = wt;
    }

    BoxWeight(BoxWeight bw) {
        super(bw); 
        weight = bw.weight;
    }

    void displayWeight() {
        System.out.println("Weight of Box = " + weight);
    }
}

public class q3 {
    public static void main(String[] args) {
        System.out.println("ANSH RANA\n24CSU275");
        BoxWeight bw1 = new BoxWeight(2, 3, 4, 10);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight();
        bw2.width = 5;
        bw2.height = 6;
        bw2.depth = 7;
        bw2.weight = 20;
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight(bw1);
        bw3.displayVolume();
        bw3.displayWeight();
    }
}
