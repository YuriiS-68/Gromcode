package DzToLesson10;

import java.util.Date;

/**
 * Created by Skorodielov on 16.06.2017.
 */
public class FurnitureOrder extends Order{
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder(){

        if (getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() == "Львов"){
            if (getBasePrice() >= 500 && getCustomerOwned().getName() != "Тест"){
                if (getCustomerOwned().getGender() == "Женский" || getCustomerOwned().getGender() == "Мужской"){
                        setDateConfirmed(new Date());
                }
            }
        }
    }

    @Override
    public void calculatePrice(){

        if (getBasePrice() < 5000){
            setTotalPrice(getBasePrice() * 105 / 100);
        }
        else setTotalPrice(getBasePrice() * 102 / 100);
    }
}
