package tc.wo.nage.bus.smartbusbell;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

import static tc.wo.nage.bus.smartbusbell.R.id.map;

public class MapBusActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private PolylineOptions polylineOptions;
    private ArrayList<LatLng> arrayPoints = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_bus);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // default location seoul
        LatLng SEOUL = new LatLng( 37.56, 126.97);

        LatLng p1 = new LatLng( 37.8, 127);
        LatLng p2 = new LatLng( 37.56, 126.97);


        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().position(SEOUL).title("서울입니다."));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SEOUL,16));

        drawPolyline(p1);
        drawPolyline(p2);
    }


    public void drawPolyline(LatLng latLng1) {
        polylineOptions = new PolylineOptions();
        polylineOptions.color(Color.RED);
        polylineOptions.width(5);
        arrayPoints.add(latLng1);
        polylineOptions.addAll(arrayPoints);
        mMap.addPolyline(polylineOptions);
    }

}

