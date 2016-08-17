package turntotech.org.navigationcontroller;

//import android.support.v4.app.FragmentTransaction;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import turntotech.org.navigationcontroller.fragments.CompanyFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new CompanyFragment()).commit();





        //String[] data = { "Samsung", "Apple","hello" };

      //  int[] icons = { R.drawable.samsung_logo, R.drawable.opo };

        // Provide the cursor for the list view.
     //   setListAdapter(new CustomListAdapter(this, data, icons));

		/* setOnItemClickListener() Register a callback to be invoked when an item
		 * in this AdapterView has been clicked.
		 */

    //    getListView().setOnItemClickListener(this);
    }
}
