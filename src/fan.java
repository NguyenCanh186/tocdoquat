public class fan {
    int speed ;
    int R = 5;
    String tocDo;
    String color = "blue";
    boolean check = false;
    public fan(){
    }
    public fan( int speed, int R, String color ){
        this.speed = speed;
        this.R = R;
        this.color = color;
    }
    public boolean off(){
        return check=false;
    }
    public boolean on() {
        return check=true;
    }
    public int getSpeed(){

        return this.speed;
    }
    public int getR(){
        return this.R;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(int s){
        speed = s;
    }
    public void setR(int radius){
        R = radius;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String toString(){
        if (speed == 1){
            tocDo = "SLOW";
        } if (speed == 2){
            tocDo = "MEDIUM";
        } if (speed == 3){
            tocDo = "FAST";
        }
        if (check){
            return "speed: " + tocDo +  " color: " +color +" ban kinh "+ R + " fan is on";
        } else {
            return " color: " +color +" ban kinh "+ R + " fan is off";
        }
    }
}
