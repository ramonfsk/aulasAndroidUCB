package com.example.uc14100797.listviewpersonalized01.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uc14100797.listviewpersonalized01.MainActivity;
import com.example.uc14100797.listviewpersonalized01.R;
import com.example.uc14100797.listviewpersonalized01.model.Car;

import java.util.List;

/**
 * Created by UC14100797 on 05/09/2018.
 */

public class AdapterCar extends BaseAdapter {

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    private Activity activity;
    private List<Car> cars;

    public AdapterCar(Activity activity, List<Car> cars) {
        this.activity = activity;
        this.cars = cars;
    }

    @Override
    public int getCount() {
        return cars.size();
    }
    //Procurar sobre esse item, dever de casa.
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Car car = cars.get(i);
        //Procurar sobre esse item, dever de casa.
        //View vCar = LayoutInflater.from(this.activity).inflate(R.layout.layout_listcars, null);
        view = View.inflate(activity, R.layout.layout_listcars, null);

        TextView fabricante = view.findViewById(R.id.fabricante);
        TextView modelo = view.findViewById(R.id.modelo);
        ImageView imgLogo = view.findViewById(R.id.imgLogo);


        if(car.getModelo().equals("models")) {
            imgLogo.setImageResource(car.getCodFabricante());
            fabricante.setText(car.getFabricante());
            modelo.setText(car.getModelo());
        }else{
            imgLogo.setImageResource(R.drawable.logofiat);
            fabricante.setText(car.getFabricante());
            modelo.setText(car.getModelo());
        }

        return view;
    }
}
