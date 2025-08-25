package pack2;

public class BoxMain {
    public static void main(String args[]){

        NewBox<Integer> intBox = new NewBox<>();
        intBox.setItem(45);
        System.out.println("Integer Value:"+intBox.getItem());
        System.out.println();

        NewBox<Float> floatBox = new NewBox<>();
        floatBox.setItem(0.45f);
        System.out.println("Float value:"+floatBox.getItem());
        System.out.println();

        NewBox<String> stringBox = new NewBox<>();
        stringBox.setItem("Box");
        System.out.println("String Value:"+stringBox.getItem());

    }
}
