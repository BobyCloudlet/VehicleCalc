package Class;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VehicleCalc {
    private short carPower;
    private short carAge;
    private String carRegistrationRegion; // Регион регистрации автомобиля

    // Получаем нологовую ставку по названию региона
    private float getTaxRate(String carRegistrationRegion){
        Map<String,Float> tax = new HashMap<String,Float>();
        tax.put("Минск", 5.0f);
        tax.put("Гродно", 6.0f);
        tax.put("Брест", 3.0f);
        tax.put("Гомель", 6.0f);
        tax.put("Могилев", 9.0f);
        tax.put("Витебск", 9.0f);
        return tax.get(carRegistrationRegion);
    }

    public float distribution(short carPower, short carAge, String carRegistrationRegion){
        return (getTaxRate(carRegistrationRegion) + carPower * 12 + (carAge * 0.5f))/100;
    }

    //GetSet//

    public short getCarPower() {
        return carPower;
    }

    public void setCarPower(short carPower) {
        this.carPower = carPower;
    }

    public short getCarAge() {
        return carAge;
    }

    public void setCarAge(short carAge) {
        this.carAge = carAge;
    }

    public String getCarRegistrationRegion() {
        return carRegistrationRegion;
    }

    public void setCarRegistrationRegion(String carRegistrationRegion) {
        this.carRegistrationRegion = carRegistrationRegion;
    }
}
