package com.myself.serena_pc.udiscoverapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        destination = getIntent().getStringExtra("DESTINATION_CHOICE");
    }

    public static LatLng getLatLng(String location){

        LatLng toReturn = null;


        switch(location){

            case "201 9th Ave.":
                toReturn = new LatLng(40.195280, -75.460034);
                break;

            case "30-32 6th Ave.":
                toReturn = new LatLng(40.190404, -75.458659);
                break;

            case "424-426 Main St.":
                toReturn = new LatLng(40.188710, -75.454313);
                break;

            case "444 Main St.":
                toReturn = new LatLng(40.188926, -75.454383);
                break;

            case "624 Main St.":
                toReturn = new LatLng(40.191550, -75.459269);
                break;

            case "732 Main St.":
                toReturn = new LatLng(40.192285, -75.461041);
                break;

            case "777 Main St.":
                toReturn = new LatLng(40.192535, -75.459866);
                break;

            case "942 Main St.":
                toReturn = new LatLng(40.193341, -75.463948);
                break;

            case "944 Main St.":
                toReturn = new LatLng(40.193511, -75.464281);
                break;

            case "Barbershop (476 Main St.)":
                toReturn = new LatLng(40.189772, -75.455286);
                break;

            case "Beardwood Hall":
                toReturn = new LatLng(40.192624, -75.455802);
                break;

            case "Berman Art Museum":
                toReturn = new LatLng(40.191889, -75.456277);
                break;

            case "Bomberger Hall":
                toReturn = new LatLng(40.191966, -75.457117);
                break;

            case "Bookstore":
                toReturn = new LatLng(40.193265, -75.456758);
                break;

            case "Brodbeck Hall":
                toReturn = new LatLng(40.192956, -75.457820);
                break;

            case "Campus Safety":
                toReturn = new LatLng(40.192895, -75.456699);
                break;

            case "Clamer Hall":
                toReturn = new LatLng(40.188562, -75.453233);
                break;

            case "Cloake House":
                toReturn = new LatLng(40.193057, -75.461127);
                break;

            case "Commonwealth Hall":
                toReturn = new LatLng(40.190401, -75.456187);
                break;

            case "Corson Hall":
                toReturn = new LatLng(40.191481, -75.455823);
                break;

            case "Curtis Hall":
                toReturn = new LatLng(40.193144, -75.458274);
                break;

            case "Duryea Hall":
                toReturn = new LatLng(40.191332, -75.458803);
                break;

            case "E.F. Snell Hockey Field":
                toReturn = new LatLng(40.195610, -75.455586);
                break;

            case "Elliot House":
                toReturn = new LatLng(40.192653, -75.460162);
                break;

            case "Facilities Service/Mail Center":
                toReturn = new LatLng(40.191853, -75.454597);
                break;

            case "Fetterolf House":
                toReturn = new LatLng(40.191055, -75.457858);
                break;

            case "Floy Lewis Bake Center/Helfferich Gym":
                toReturn = new LatLng(40.194402, -75.456910);
                break;

            case "Hillel House":
                toReturn = new LatLng(40.190547, -75.459089);
                break;

            case "Hobson Hall":
                toReturn = new LatLng(40.191163, -75.458269);
                break;

            case "Hunsberger Practice Field/Organic Farm":
                toReturn = new LatLng(40.198503, -75.457931);
                break;

            case "Isenberg Hall":
                toReturn = new LatLng(40.192705, -75.460852);
                break;

            case "Kaleidoscope":
                toReturn = new LatLng(40.193943, -75.457958);
                break;

            case "Keigwin Hall":
                toReturn = new LatLng(40.190772, -75.456234);
                break;

            case "Lynnewood Hall":
                toReturn = new LatLng(40.191895, -75.460069);
                break;

            case "Maples Hall":
                toReturn = new LatLng(40.190480, -75.456545);
                break;

            case "Musser Hall":
                toReturn = new LatLng(40.190836, -75.459042);
                break;

            case "Myrin Library":
                toReturn = new LatLng(40.192487, -75.457496);
                break;

            case "New Hall":
                toReturn = new LatLng(40.193625, -75.454592);
                break;

            case "North Hall":
                toReturn = new LatLng(40.193152, -75.454723);
                break;

            case "Olevian Hall":
                toReturn = new LatLng(40.191685, -75.459670);
                break;

            case "Olin Hall":
                toReturn = new LatLng(40.192351, -75.456767);
                break;

            case "Omwake Hall":
                toReturn = new LatLng(40.193004, -75.459350);
                break;

            case "Paisley Hall":
                toReturn = new LatLng(40.192658, -75.455360);
                break;

            case "Patterson Field":
                toReturn = new LatLng(40.194752, -75.454648);
                break;

            case "Pfahler Hall":
                toReturn = new LatLng(40.192744, -75.458893);
                break;

            case "Practice Field North":
                toReturn = new LatLng(40.196029, -75.453589);
                break;

            case "Practice Field South":
                toReturn = new LatLng(40.192627, -75.453877);
                break;

            case "Reimert Hall":
                toReturn = new LatLng(40.193640, -75.459110);
                break;

            case "Richter Hall":
                toReturn = new LatLng(40.193366, -75.455200);
                break;

            case "Ritter Hall":
                toReturn = new LatLng(40.194506, -75.455878);
                break;

            case "Schaff Hall":
                toReturn = new LatLng(40.191813, -75.459801);
                break;

            case "Shreiner Hall":
                toReturn = new LatLng(40.191813, -75.459801);
                break;

            case "Snell Softball Field":
                toReturn = new LatLng(40.196504, -75.454693);
                break;

            case "Sprankle Hall":
                toReturn = new LatLng(40.191389, -75.455146);
                break;

            case "Stauffer Hall":
                toReturn = new LatLng(40.192338, -75.455192);
                break;

            case "Sturgis Hall":
                toReturn = new LatLng(40.190533, -75.458463);
                break;

            case "Tennis Court":
                toReturn = new LatLng(40.196669, -75.455814);
                break;

            case "Thomas Baseball Field":
                toReturn = new LatLng(40.196320, -75.457271);
                break;

            case "Thomas Hall":
                toReturn = new LatLng(40.193005, -75.459384);
                break;

            case "Todd Hall":
                toReturn = new LatLng(40.192173, -75.460734);
                break;

            case "Unity House":
                toReturn = new LatLng(40.191051, -75.456255);
                break;

            case "Wellness Center":
                toReturn = new LatLng(40.193406, -75.460118);
                break;

            case "Wicks House":
                toReturn = new LatLng(40.192043, -75.460376);
                break;

            case "Wilkes Soccer Field":
                toReturn = new LatLng(40.192043, -75.460376);
                break;

            case "Wilkinson Hall":
                toReturn = new LatLng(40.193036, -75.458059);
                break;

            case "Wismer Center":
                toReturn = new LatLng(40.192999, -75.456444);
                break;

            case "Zwingli Hall":
                toReturn = new LatLng(40.191429, -75.459050);
                break;
        }
        return toReturn;
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
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng mLatLng = getLatLng(destination);
        //LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(mLatLng).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mLatLng, 25));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(18), 2050, null);
    }
}
