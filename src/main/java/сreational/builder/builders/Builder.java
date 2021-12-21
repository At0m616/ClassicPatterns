package сreational.builder.builders;

import сreational.builder.cars.CarType;
import сreational.builder.components.Engine;
import сreational.builder.components.GPSNavigator;
import сreational.builder.components.Transmission;
import сreational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
