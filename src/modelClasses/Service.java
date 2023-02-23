/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClasses;

/**
 *
 * @author reyan
 */
public class Service {
    private String name;
    private String capacity;
    private int price;
    private float tarrifRate;
    private Client takenBy;

    public Service(String name, String capacity) {
        this.name = name;
        this.capacity = capacity;
        this.takenBy = takenBy;
        if(capacity=="100MBPS"){
            price = 500;
            tarrifRate = 5.0f;
        }else if(capacity=="5000MBPS"){
            price = 1000;
            tarrifRate = 2.5f;
        }else if(capacity=="10000MBPS"){
            price = 2000;
            tarrifRate = 1.35f;
        }
    }

    public Service() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getTarrifRate() {
        return tarrifRate;
    }

    public void setTarrifRate(float tarrifRate) {
        this.tarrifRate = tarrifRate;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
        if(capacity.equals("100MBPS")){
            price = 500;
            tarrifRate = 5.0f;
        }else if(capacity.equals("5000MBPS")){
            price = 1000;
            tarrifRate = 2.5f;
        }else if(capacity.equals("10000MBPS")){
            price = 2000;
            tarrifRate = 1.35f;
        }
    }

    public Client getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(Client takenBy) {
        this.takenBy = takenBy;
    }
    
    
}
