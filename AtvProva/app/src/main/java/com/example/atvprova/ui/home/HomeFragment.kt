package com.example.atvprova.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atvprova.MainActivity
import com.example.atvprova.R
import com.example.atvprova.databinding.FragmentHomeBinding
import com.example.atvprova.models.Personagem
import com.example.atvprova.views.adapters.HomeAdapter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private lateinit var mPersonagens: List<Personagem>

    private lateinit var mBinding: FragmentHomeBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_home)



        mPersonagens = listOf(
            Personagem("Achilles", "https://static.wikia.nocookie.net/disney/images/d/d3/Vlcsnap-2015-05-06-23h04m15s601.png"),
            Personagem("Abigail the Cow", "https://static.wikia.nocookie.net/disney/images/0/05/Fox-disneyscreencaps_com-901.jpg"),
            Personagem("Abdullah", 	"https://static.wikia.nocookie.net/disney/images/c/cb/1087603-44532-clp-950.jpg"),
            Personagem("Candace Adams", "https://static.wikia.nocookie.net/disney/images/8/8b/Enemy_of_the_State_promo_3.jpg"),
            Personagem("Ahadi", "https://static.wikia.nocookie.net/disney/images/b/b3/Ahadihead.png"),
            Personagem("Admiral Boom and Mr. Binnacle", "https://static.wikia.nocookie.net/disney/images/b/be/Marypoppins-disneyscreencaps_com-1086.jpg"),
            Personagem("90's Adventure Bear", "https://static.wikia.nocookie.net/disney/images/3/3f/90%27s_Adventure_Bear_profile.png"),
            Personagem("Al Muddy Sultan", "https://static.wikia.nocookie.net/disney/images/e/e0/Almuddyking.jpg"),
            Personagem("Irwina Allen", "https://static.wikia.nocookie.net/disney/images/4/48/Chip_%27n_Dale_Rescue_Rangers_109_Risky_Beesness_arsenaloyal_-_YouTube12.jpg"),
            Personagem("Ambrose", "https://static.wikia.nocookie.net/disney/images/d/d3/Ambrose.jpg"),
            Personagem("Amos","https://static.wikia.nocookie.net/disney/images/8/83/Tve8132-19531110-2244.jpg"),
            Personagem("Arabella Smith", "https://static.wikia.nocookie.net/disney/images/d/da/Bella_sign.webp"),
            Personagem("Queen Ariel", "https://static.wikia.nocookie.net/disney/images/e/e8/Char_49883.jpg"),
            Personagem("Arthur and Cecil", "https://static.wikia.nocookie.net/disney/images/e/e9/Arthur_%26_Cecil.png"),
            Personagem("Fiona Ashbury", 	"https://static.wikia.nocookie.net/disney/images/e/ed/Fiona_Ashbury.jpg"),
            Personagem(	"Ashcan and Pete", "https://static.wikia.nocookie.net/disney/images/8/88/AshcanPete.PNG"),
            Personagem("Aspen", "https://static.wikia.nocookie.net/disney/images/8/8b/Bedtime_stories_aspen.jpg"),
            Personagem("Astuto", "https://static.wikia.nocookie.net/disney/images/3/3e/Lion_Guard_S03E014_-_Astuto_%28fox%29_Profile.jpg"),
            Personagem(	"Athena", "https://static.wikia.nocookie.net/disney/images/d/db/Athena_Tomorrowland.jpg"),
            Personagem("Aunt Em", "https://static.wikia.nocookie.net/disney/images/5/5d/Em4.jpg"),
        )

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = HomeAdapter(mPersonagens)

        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}