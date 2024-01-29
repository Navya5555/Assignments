public class trafficLight {
    public static final String RED = "Red";
    public static final String GREEN = "GREEN";
   private String color;
    private int duration;
    public trafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public boolean isRed() {
        return RED.equals(color);
    }

    public boolean isGreen() {
        return GREEN.equals(color);
    }

    public static void main(String[] args) {
        trafficLight change1 = new trafficLight(RED, 60);

        System.out.println("First Traffic Light");
        System.out.println("color : " + change1.getColor());
        System.out.println("Duration : " + change1.getDuration());

        change1.changeColor(GREEN);

        System.out.println("\nChanged Traffic Light");
        System.out.println("Color : " + change1.getColor());
        System.out.println("Duration : " + change1.getDuration());

        System.out.println(change1.isRed());
        System.out.println(change1.isGreen());
    }
}



