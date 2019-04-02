package edu.psu.ist;

import java.util.ArrayList;

public class Menu {

    // Class Level Variables - Protect the data
    private int menuId;
    private String menuItem;
    private float itemPrice;

    // Constructor Method
    public Menu(int _menuId, String _menuItem, float _itemPrice){
        this.menuId = _menuId;
        this.menuItem = _menuItem;
        this.itemPrice = _itemPrice;
    }

    // Setters and Getters
    public int getmenuId() {
        return menuId;
    }
    public void setmenuId(int _menuId) {
        this.menuId = _menuId;
    }

    public String getmenuItem() {
        return menuItem;
    }
    public void setmenuItem(String _menuItem) {
        this.menuItem = _menuItem;
    }
    public float getitemPrice() {
        return itemPrice;
    }
    public void setitemPrice(float _itemPrice) {
        this.itemPrice = _itemPrice;
    }

    public static void listMenu(ArrayList<Menu> mList){
        for (Menu menu: mList){
            System.out.print(menu.getmenuItem() + " ");
            System.out.println(menu.getitemPrice());
        }
    }
}
