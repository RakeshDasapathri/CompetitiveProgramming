class createrectangle {
    private int leftX;
    private int bottomY;
    private int width;
    private int height;

    public createrectangle() {}

    public createrectangle(int leftX, int bottomY, int width, int height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public String toString()
    {
        return String.format("(%d, %d, %d, %d)", leftX, bottomY, width, height);
    }
}
public class rectangule_love {
    static createrectangle getpoint(createrectangle  r1, createrectangle r2) //Finds Intersection of Two createrectangles
    {
        int highest_start_point_x = Math.max(r1.getLeftX(), r2.getLeftX());
        int lowest_end_point_x = Math.min(r1.getLeftX() + r1.getWidth(), r2.getLeftX() + r2.getWidth());

        int highest_start_point_y = Math.max(r1.getBottomY(), r2.getBottomY());
        int lowest_end_point_y = Math.min(r1.getBottomY() + r1.getHeight(), r2.getBottomY() + r2.getHeight());
        if ((highest_start_point_x >= lowest_end_point_x) || (highest_start_point_y >= lowest_end_point_y)) {
            return null;

        } 
        else {
            int newX = highest_start_point_x;
            int newY = highest_start_point_y;
            int newWidth = lowest_end_point_x - newX;
            int newHeight = lowest_end_point_y - newY;
            return new createrectangle(newX, newY, newWidth, newHeight);
        }
    }
    public static void main(String[] args) {
        createrectangle X = new createrectangle(1, 1, 1, 6); 
        createrectangle Y = new createrectangle(1, 12, 13, 6); 
        System.out.println(getpoint(X, Y)); 
    }
}
