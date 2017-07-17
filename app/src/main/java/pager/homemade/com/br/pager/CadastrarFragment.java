package pager.homemade.com.br.pager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CadastrarFragment extends Fragment {

private Button btnCadFragment;
    public CadastrarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cadastrar, container, false);
        btnCadFragment = (Button) view.findViewById(R.id.btnEntrarLogin);

        btnCadFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Cadastrado com sucesso!!", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
