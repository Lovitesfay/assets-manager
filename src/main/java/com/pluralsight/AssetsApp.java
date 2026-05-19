package com.pluralsight;

import java.util.ArrayList;

public class AssetsApp {
    public static void main(String[] args) {

// House
        // A house's value is determined as
// $180.00 per square foot (excellent)
// $130.00 per square foot (good)
// $90.00 per square foot (fair)
// $80.00 per square foot (poor)
// PLUS 25 cents per square foot of lot size

// Vehicle
// A car's value is determined as
// 0-3 years old - 3% reduced value of cost per year
// 4-6 years old - 6% reduced value of cost per year
// 7-10 years old - 8% reduced value of cost per year
// over 10 years old - $1000.00
// MINUS reduce final value by 25% if over 100,000 miles
// unless makeModel contains word Honda or Toyota

        ArrayList<Asset> myAssets = new ArrayList<>();
        String message = "";
        Object asset = myAssets;

        if (asset instanceof House house) {
            House house1 = (House) myAssets.get(1);
            message = "House at " + house.getAddress();
        } else if (asset instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) myAssets.get(1);
            message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
        }
        System.out.println(message);
    }
}