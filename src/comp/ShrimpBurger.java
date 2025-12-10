package comp;

/**
 * super의 개념잡기
 * 생성자 개념잡기
 */
public class ShrimpBurger extends Burger {
    private String material; //재료(새우)

    public ShrimpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;

    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "ShrimpBurger{" +
                "material='" + material + '\'' +
                '}';
    }
}