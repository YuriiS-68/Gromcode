package DzToLesson10;

import java.util.Date;

/**
 * Created by Skorodielov on 16.06.2017.
 */
public class ElectronicsOrder extends Order {
    private int guaranteeMonth;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonth) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.guaranteeMonth = guaranteeMonth;
    }

    @Override
    public void validateOrder(){

        if (getShipToCity() == "Киев" || getShipToCity() == "Одеса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков"){
            if (getBasePrice() >= 100 && getCustomerOwned().getGender() == "Женский"){
                if (getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() == "Одеса" || getCustomerOwned().getCity() == "Днепр" || getCustomerOwned().getCity() == "Харьков"){
                    setDateConfirmed(new Date());
                }
            }
        }
    }

    @Override
    public void calculatePrice() {

        if (getShipToCity() != "Одесса" || getShipToCity() != "Киев"){
            setTotalPrice(getBasePrice() + (getBasePrice() * 15 / 100));
        }
        else setTotalPrice(getBasePrice() + (getBasePrice() * 10 / 100));

        if (getBasePrice() > 1000){
            setTotalPrice(getTotalPrice() - (getTotalPrice() * 5 / 100));
        }
    }
}
