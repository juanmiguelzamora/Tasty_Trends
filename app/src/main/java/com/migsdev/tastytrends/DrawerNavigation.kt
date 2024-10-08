package com.migsdev.tastytrends

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView

class DrawerNavigation : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private var recyclerView : RecyclerView? = null
    private var recyclerViewStallsAdapter : RecyclerViewStallsAdapter? = null
    private var stallList = mutableListOf<Stalls>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_drawer_navigation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drawer_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        stallList = ArrayList()

        recyclerView = findViewById<View>(R.id.rvStallLists) as RecyclerView
        recyclerViewStallsAdapter = RecyclerViewStallsAdapter(this@DrawerNavigation, stallList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = recyclerViewStallsAdapter

        prepareStallsListData()

        // Initialize DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout)

        // Find and set up the Toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Set up the NavigationView and listen for item selections
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this) // MainActivity implements listener

        // Set up drawer toggle
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    private fun prepareStallsListData() {
        var stalls = Stalls("jfc", R.drawable.jfc)
        stallList.add(stalls)
        stalls = Stalls("arnold", R.drawable.arnold)
        stallList.add((stalls))

        stalls = Stalls("happiness", R.drawable.happiness_food)
        stallList.add((stalls))

        stalls = Stalls("specialvigan", R.drawable.speical_vigan)
        stallList.add((stalls))

        stalls = Stalls("kyah", R.drawable.khay_sa_wrap)
        stallList.add((stalls))

        stalls = Stalls("jdj", R.drawable.jdjdimsum)
        stallList.add((stalls))

        stalls = Stalls("hotto", R.drawable.hotto)
        stallList.add((stalls))

        stalls = Stalls("buko", R.drawable.buko)
        stallList.add((stalls))

        stalls = Stalls("gaerlan", R.drawable.gaerlan)
        stallList.add((stalls))

        stalls = Stalls("jos", R.drawable.jos)
        stallList.add((stalls))

        recyclerViewStallsAdapter!!.notifyDataSetChanged()
    }

    // Replace fragments dynamically
    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }

    // Implement the onNavigationItemSelected method to handle menu item clicks
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navHome -> {
                // Handle Home navigation
                replaceFragment(HomeFragment())
            }
//            R.id.navProfile -> {
//                replaceFragment()
//            }
            R.id.navOrders -> {
                // Handle Settings navigation
                replaceFragment(OrdersFragment())
            }
            R.id.navFavorite -> {
                replaceFragment(FavoritesFragment())
            }
        }
        // Close the drawer after selecting an item
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    // Handle back button behavior
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed() // Correct back press handling for modern Android
        }
    }
}
