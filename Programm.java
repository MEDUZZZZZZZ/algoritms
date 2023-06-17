package algoritms;

public class Programm {
    public static void main(String[] args) {
        Mapa <Integer, String> mapa = new Mapa<>();
        System.out.println(mapa.put(1, "I am"));
        System.out.println(mapa.put(2, "Hash table"));
        System.out.println(mapa.put(3, "a"));
        System.out.println(mapa.put(17, "b"));
        System.out.println(mapa.put(18, "c"));
        System.out.println(mapa.put(1, "Not"));
        System.out.println(mapa.put(2, null));
        System.out.println();
        System.out.println(mapa.containsKey(1));
        System.out.println(mapa.containsKey(5));
        System.out.println(mapa.containsKey(2));
        System.out.println();
        System.out.println(mapa.get(3));
        System.out.println("Удаляем элемент");
        System.out.println(mapa.remove(3));
        System.out.println("Проверка удаления");
        System.out.println(mapa.get(3));
        System.out.println();
        System.out.println(mapa.containsValue("c"));
        System.out.println(mapa.containsValue("Error"));
        
    }
}
