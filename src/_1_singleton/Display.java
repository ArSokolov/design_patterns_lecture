package _1_singleton;

public class Display {

    private Display(){
        // инициализация
    }

    public static Display INSTANCE = new Display();

    public void draw(Object obj){
        // отображаем
    }
}
