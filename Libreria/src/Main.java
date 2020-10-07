import Conversiones.conversion;

public class Main {
    public static void main(String[] args) {
        conversion conversion = new conversion();
        String res = conversion.binario(2);
        System.out.println(res);
        res=conversion.hex(16);
        System.out.println(res);
    }
}
