package Class;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VehicleCalc {
    private short carPower;
    private short carAge;
    private String carRegistrationRegion; // Регион регистрации автомобиля

    // Получить нологовую ставку по названию региона
    private float getTax(String carRegistrationRegion){
        Map<String,Float> tax = new HashMap<String,Float>();
        tax.put("Минск", 61.0f);
        tax.put("Гродно", 96.0f);
        tax.put("Брест", 27.0f);
        tax.put("Гомель", 66.0f);
        tax.put("Могилев", 39.0f);
        tax.put("Витебск", 69.0f);
        return tax.get(carRegistrationRegion);
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
