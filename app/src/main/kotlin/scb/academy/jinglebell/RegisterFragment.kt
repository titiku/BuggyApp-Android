package scb.academy.jinglebell;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment;
import kotlinx.android.synthetic.main.fragment_register.view.*
import scb.academy.jinglebell.activity.ShowRegister
import scb.academy.jinglebell.activity.SongInfoActivity

class RegisterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var _view = inflater.inflate(R.layout.fragment_register, container, false)
        _view.btnregister.setOnClickListener {
            val intent = Intent (context, ShowRegister::class.java)

            intent.putExtra("name",_view.textname.text.toString())
            Log.i("testball",_view.textname.text.toString())
            context!!.startActivity(intent)
        }
        return _view
    }
}
