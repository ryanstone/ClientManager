package layout;

import android.content.Context;
<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
<<<<<<< HEAD
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.stoneryan.android.clientmanager.LogoffActivity;
=======
import android.view.View;
import android.view.ViewGroup;

>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
import com.stoneryan.android.clientmanager.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DisplayUsernameFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DisplayUsernameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DisplayUsernameFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public DisplayUsernameFragment() {
        // Required empty public constructor
    }

<<<<<<< HEAD
=======
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DisplayUsernameFragment.
     */
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
    // TODO: Rename and change types and number of parameters
    public static DisplayUsernameFragment newInstance() {
        DisplayUsernameFragment fragment = new DisplayUsernameFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main_options_menu, menu);
        menu.findItem(R.id.settings_menu_item).setIntent(
                new Intent(getActivity(), LogoffActivity.class)
        );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id== R.id.settings_menu_item) {
            super.onOptionsItemSelected(item);
            startActivity(item.getIntent());

        }
        return true;
=======
>>>>>>> 4067b578267fc7c818159cfdba7e381f5eb3d3a5
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_username, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
