public class WrapperToPrimitive {
    public static void main(String[] args) {

        Double d = 45.67;

        double primitiveDouble = d;
        int primitiveInt = (int) primitiveDouble;

        System.out.println("Double value: " + primitiveDouble);
        System.out.println("Integer value: " + primitiveInt);
    }
}