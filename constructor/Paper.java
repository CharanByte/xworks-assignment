public class Paper {
     double thickness;
     String size;
     String quality;
     String color;

    
    public Paper() {
        this.thickness = 3.0;
        this.size = "45";
        this.quality = "4";
        this.color = "DefaultColor";
    }


    public Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

  
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Thickness: " + thickness + ", Size: " + size + ", Quality: " + quality + ", Color: " + color);
    }
}
